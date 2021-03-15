package com.franktran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Driver {

    @Autowired
    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }
}
