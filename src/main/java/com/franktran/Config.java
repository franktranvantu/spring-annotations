package com.franktran;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Vehicle bike() {
        return new Bike();
    }
}
