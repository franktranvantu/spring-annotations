package com.franktran;

import com.franktran.field.Biker;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
//        Biker biker = context.getBean("constructor", Biker.class);
//        Biker biker = context.getBean("setter", Biker.class);
        Biker biker = context.getBean("field", Biker.class);
        biker.getVehicle().run();
    }
}
