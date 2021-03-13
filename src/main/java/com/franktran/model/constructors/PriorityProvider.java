package com.franktran.model.constructors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:constructors.properties")
public class PriorityProvider {

  private String priority;

  public PriorityProvider(@Value("${priority:normal}") String priority) {
    this.priority = priority;
  }

  @Override
  public String toString() {
    return "PriorityProvider{" +
        "priority='" + priority + '\'' +
        '}';
  }
}
