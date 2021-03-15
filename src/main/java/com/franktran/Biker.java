package com.franktran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Biker {

    @Autowired
    @Qualifier("bike")
    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }
}
