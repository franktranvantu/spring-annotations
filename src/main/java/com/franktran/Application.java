package com.franktran;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        Driver driver = context.getBean("driver", Driver.class);
        driver.getVehicle().run();

        Biker biker = context.getBean("biker", Biker.class);
        biker.getVehicle().run();
    }
}
