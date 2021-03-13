package com.franktran;

import com.franktran.fields.Customer;
//import com.franktran.settermethods.Customer;
//import com.franktran.constructors.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    Customer customer = context.getBean("field", Customer.class);
//    Customer customer = context.getBean("setter", Customer.class);
//    Customer customer = context.getBean("constructor", Customer.class);
    System.out.println(customer);
  }
}
