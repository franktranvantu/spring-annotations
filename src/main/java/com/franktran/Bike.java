package com.franktran;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

    @Override
    public void run() {
        System.out.println("Bike");
    }
}
