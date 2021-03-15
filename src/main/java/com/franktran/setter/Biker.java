package com.franktran.setter;

import com.franktran.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("setter")
public class Biker {

    private Vehicle vehicle;

    @Autowired
    public void setVehicle(@Qualifier("bike") Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
