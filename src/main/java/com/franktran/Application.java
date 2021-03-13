package com.franktran;

import com.franktran.config.SpringConfig;
import com.franktran.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

    Service service = context.getBean("service", Service.class);
    String connection = service.getConnection();
    System.out.println(connection);
  }
}
