package com.springboot.chapter3.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//可以掃描到對應的Controller及對應的Package
@SpringBootApplication(scanBasePackages = "com.springboot.chapter3")
public class Chapter3Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter3Application.class, args);
    }

}
