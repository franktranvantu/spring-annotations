package com.franktran;

import org.springframework.beans.factory.annotation.Required;

public class Bike {

    private String color;

    @Required
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "color='" + color + '\'' +
                '}';
    }
}
