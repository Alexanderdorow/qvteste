package com.hbsis.qvrest.runner;

import com.hbsis.qvrest.annotations.CsvDocument;
import com.hbsis.qvrest.model.BaseCsvModel;
import com.hbsis.qvrest.model.CsvModel;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.concurrent.*;

public class CsvReader<T extends BaseCsvModel> {

    private final Class<T> clazz;
    private final MongoTemplate mongoTemplate;


    public CsvReader(Class<T> clazz, MongoTemplate mongoTemplate) {
        this.clazz = clazz;
        this.mongoTemplate = mongoTemplate;
    }

    public void process() {
        BlockingQueue<T> broker = new ArrayBlockingQueue<T>(10);
        Consumer<T> consumer = new Consumer<T>(broker, mongoTemplate);
        Producer<T> producer = new Producer<T>(broker, clazz);
        new Thread(consumer).start();
        new Thread(producer).start();
    }

}
