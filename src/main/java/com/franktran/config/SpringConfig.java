package com.franktran.config;

import com.franktran.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class SpringConfig {

  @Bean
  @Lazy
  public Person person() {
    System.out.println("Lazy bean");
    return new Person(28, "Frank");
  }
}
