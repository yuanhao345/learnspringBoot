package com.yh.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringBoot01Application {

    public static void main(String[] args) {

        ApplicationContext ac = SpringApplication.run(SpringBoot01Application.class, args);
        ac.getBean("preson");

    }

}
