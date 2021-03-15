package com.franktran.constructors;

import com.franktran.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("constructor")
public class Car {

  private Engine engine;

  @Autowired
  public Car(Engine engine) {
    this.engine = engine;
  }

  @Override
  public String toString() {
    return "Car{" +
            "engine=" + engine +
            '}';
  }
}
