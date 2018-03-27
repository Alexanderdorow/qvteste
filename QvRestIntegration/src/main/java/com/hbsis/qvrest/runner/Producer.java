package com.hbsis.qvrest.runner;

import com.hbsis.qvrest.annotations.CsvDocument;
import com.opencsv.CSVIterator;
import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.BlockingQueue;

public class Producer<T> implements Runnable {

    private Class<T> clazz;
    private BlockingQueue<T> queue;

    public Producer(BlockingQueue<T> q, Class<T> clazz) {
        this.queue = q;
        this.clazz = clazz;
    }

    public void run() {
        CSVIterator iterator;
        try {
            CsvDocument annotation = clazz.getAnnotation(CsvDocument.class);
            File folder = new File(annotation.path());

            File fileToBeProcessed = null;
            for (File file : folder.listFiles()) {
                boolean contains = file.getName().contains(annotation.fileName());
                if (contains) {
                    fileToBeProcessed = file;
                    break;
                }
            }

            if (fileToBeProcessed == null) {
                throw new RuntimeException("file not found");
            }

            CSVReader reader = new CSVReader(new FileReader(fileToBeProcessed), ';');
            iterator = new CSVIterator(reader);
            //remove header
            iterator.next();

            while (iterator.hasNext()) {
                String[] nextLine = iterator.next();
                Constructor<T> constructor = clazz.getConstructor(String[].class);
                Object[] params = new Object[]{nextLine};
                T obj = constructor.newInstance(params);
                queue.put(obj);
            }
            Constructor<T> constructor = clazz.getConstructor(boolean.class);
            Object[] params = new Object[]{true};
            T obj = constructor.newInstance(params);
            queue.put(obj);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
