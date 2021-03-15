package com.franktran;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        Engine engine1 = context.getBean("engine", Engine.class);
        Engine engine2 = context.getBean("engine", Engine.class);
        System.out.println(engine1 == engine2);
    }
}
