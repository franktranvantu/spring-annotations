package com.franktran;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Car car() {
        return new Car(engine());
    }

    @Bean
    public Engine engine() {
        return new Engine();
    }
}
