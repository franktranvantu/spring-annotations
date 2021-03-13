package com.franktran;

import com.franktran.config.SpringConfig;
import com.franktran.model.constructors.PriorityProvider;
import com.franktran.model.fields.Person;
import com.franktran.model.fields.Student;
import com.franktran.model.setters.CollectionProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

    Person person = context.getBean("person", Person.class);
    System.out.println(person);

    Student student = context.getBean("student", Student.class);
    System.out.println(student);

    CollectionProvider collectionProvider = context.getBean("collectionProvider", CollectionProvider.class);
    System.out.println(collectionProvider);

    PriorityProvider priorityProvider = context.getBean("priorityProvider", PriorityProvider.class);
    System.out.println(priorityProvider);
  }
}
