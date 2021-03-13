package com.franktran.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.franktran.service", "com.franktran.dao"})
public class SpringConfig {
}
