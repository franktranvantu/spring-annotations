package com.franktran;

import com.franktran.constructor.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(Application.class, args);
    Car car = context.getBean("constructor", Car.class);
//    Car car = context.getBean("setter", Car.class);
//    Car car = context.getBean("field", Car.class);
    System.out.println(car);
  }
}
