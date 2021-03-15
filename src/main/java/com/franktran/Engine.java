package com.franktran;

import org.springframework.stereotype.Component;

@Component
public class Engine {

    private String name = "diesel";

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                '}';
    }
}
