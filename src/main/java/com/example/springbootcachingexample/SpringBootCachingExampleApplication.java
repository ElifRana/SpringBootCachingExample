package com.example.springbootcachingexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootCachingExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCachingExampleApplication.class, args);
    }

}
