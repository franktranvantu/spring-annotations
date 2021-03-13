package com.franktran.fields;

import com.franktran.Person;
import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

  @Autowired
  private Person person;
  private int type;

  @Override
  public String toString() {
    return "Customer{" +
        "person=" + person +
        ", type=" + type +
        '}';
  }
}
