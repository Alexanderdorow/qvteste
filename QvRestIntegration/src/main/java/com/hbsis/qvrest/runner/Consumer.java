package com.hbsis.qvrest.runner;

import com.hbsis.qvrest.model.BaseCsvModel;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.concurrent.BlockingQueue;

public class Consumer<T extends BaseCsvModel> implements Runnable {

    private final BlockingQueue<T> queue;
    private final MongoTemplate mongoTemplate;

    public Consumer(BlockingQueue<T> q, MongoTemplate mongoTemplate) {
        this.queue = q;
        this.mongoTemplate = mongoTemplate;
    }

    public void run() {
        try {
            T obj;
            while (!(obj = queue.take()).ended()) {
                mongoTemplate.save(obj);
            }
            System.out.println("Ended -> " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
