package com.franktran.config;

import com.franktran.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

  @Bean
  public Person person() {
    return new Person(28, "Frank");
  }
}
