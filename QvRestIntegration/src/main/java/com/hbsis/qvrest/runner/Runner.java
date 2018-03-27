package com.hbsis.qvrest.runner;

import com.hbsis.qvrest.annotations.CsvDocument;
import org.reflections.Reflections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class Runner {

    private static boolean EXPORTATION_LOCKED = false;
    @Autowired
    MongoTemplate mongoTemplate;

    @Scheduled(fixedRate = 1000)
    public void run() {
        if (EXPORTATION_LOCKED) {
            return;
        }
        Reflections reflections = new Reflections("com.hbsis.qvrest");
        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(CsvDocument.class);
        for (Class<?> clazz : annotated) {
            EXPORTATION_LOCKED = true;
            System.out.println("Runner started -> " + System.currentTimeMillis());
            new CsvReader(clazz, mongoTemplate).process();

        }
    }
}