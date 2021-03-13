package com.franktran.model.fields;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

  @Value("28")
  private Integer age;
  @Value("Frank")
  private String name;

  public Person() {

  }

  public Person(Integer age, String name) {
    this.age = age;
    this.name = name;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
  public Integer getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Person{" +
        "age=" + age +
        ", name='" + name + '\'' +
        '}';
  }
}

