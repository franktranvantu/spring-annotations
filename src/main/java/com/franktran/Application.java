package com.franktran;

import com.franktran.constructor.Engine;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(Application.class, args);
    Engine engine = context.getBean("constructor", Engine.class);
//    Engine engine = context.getBean("setter", Engine.class);
//    Engine engine = context.getBean("field", Engine.class);
    System.out.println(engine);
  }
}
