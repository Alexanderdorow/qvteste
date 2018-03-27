package com.hbsis.qvrest.annotations;

import org.springframework.data.annotation.Persistent;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface CsvDocument {

    String path();

    String fileName();
}
