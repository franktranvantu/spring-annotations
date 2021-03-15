package com.franktran.fields;

import com.franktran.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("field")
public class Car {

    @Autowired
    private Engine engine;

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
