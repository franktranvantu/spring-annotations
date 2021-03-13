package com.franktran.model;

public class Person {

  private Integer age;
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

