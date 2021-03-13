package com.franktran.config;

import com.franktran.model.Person;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Person.class)
public class SpringConfig {

}
