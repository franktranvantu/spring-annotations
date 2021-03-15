package com.franktran.field;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("field")
public class Engine {

  @Value("8")
  private int cylinderCount;

  @Override
  public String toString() {
    return "Engine{" +
            "cylinderCount=" + cylinderCount +
            '}';
  }
}
