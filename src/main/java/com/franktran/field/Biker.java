package com.franktran.field;

import com.franktran.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("field")
public class Biker {

    @Autowired
    @Qualifier("bike")
    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }
}
