package com.franktran;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class VehicleFactoryConfig {

    @Bean
    @Lazy(value = false)
    public Engine engine() {
        return new Engine();
    }

    @Bean
    public Car car() {
        return new Car();
    }
}
