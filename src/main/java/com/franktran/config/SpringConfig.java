package com.franktran.config;

import com.franktran.model.Student;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Student.class)
public class SpringConfig {

}
