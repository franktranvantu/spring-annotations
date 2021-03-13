package com.franktran;

import com.franktran.config.SpringConfig;
import com.franktran.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

    Person person = context.getBean("person", Person.class);
    System.out.println(person);
  }
}
