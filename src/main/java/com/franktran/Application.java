package com.franktran;

import com.franktran.constructors.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
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
