package com.franktran.constructors;

import com.franktran.Person;
import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

  private Person person;
  private int type;

  @Autowired
  public Customer(Person person) {
    this.person = person;
  }

  @Override
  public String toString() {
    return "Customer{" +
        "person=" + person +
        ", type=" + type +
        '}';
  }
}
