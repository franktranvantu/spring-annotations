package com.franktran;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("engine")
public class Car implements Vehicle {

    public Car() {
        System.out.println("Car()");
    }
}
