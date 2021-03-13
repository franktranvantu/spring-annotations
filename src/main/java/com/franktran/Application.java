package com.franktran;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    Student student = context.getBean("student", Student.class);
    System.out.println("Name: " + student.getName());
    System.out.println("Age: " + student.getAge());
  }
}
