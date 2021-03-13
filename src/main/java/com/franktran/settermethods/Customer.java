package com.franktran.settermethods;

import com.franktran.Person;
import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

  private Person person;
  private int type;

  @Autowired
  public void setPerson(Person person) {
    this.person = person;
  }

  public void setType(int type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Customer{" +
        "person=" + person +
        ", type=" + type +
        '}';
  }
}
