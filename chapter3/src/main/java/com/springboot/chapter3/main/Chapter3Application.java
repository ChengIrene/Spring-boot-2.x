package com.springboot.chapter3.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

//可以掃描到對應的Controller及對應的Package
@SpringBootApplication(scanBasePackages = "com.springboot.chapter3")
@PropertySource(value = {"classpath:application.properties"}, ignoreResourceNotFound = true)
public class Chapter3Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter3Application.class, args);
    }

}
