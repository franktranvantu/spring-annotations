package com.franktran;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(Application.class, args);
    DatasourceManager datasourceManager = context.getBean("datasourceManager", DatasourceManager.class);
    datasourceManager.setupDatasource();
  }
}
