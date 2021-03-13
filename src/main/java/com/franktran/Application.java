package com.franktran;

import com.franktran.config.SpringConfig;
import com.franktran.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

    Student student = context.getBean("student", Student.class);
    System.out.println(student);
  }
}
