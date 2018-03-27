package com.hbsis.qvrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAutoConfiguration
@EnableAsync
@EnableScheduling
@ComponentScan
@Configuration
public class Application {
    public static void main(String[] args) {
        /* ConfigurableApplicationContext context = */
        SpringApplication.run(Application.class, args);

    }
}
