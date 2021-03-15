package com.franktran;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        PropertiesWithJavaConfig config = context.getBean("propertiesWithJavaConfig", PropertiesWithJavaConfig.class);
        System.out.println(config);
    }
}
