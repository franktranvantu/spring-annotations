package com.franktran.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("constructor")
public class Engine {

  private int cylinderCount;

  public Engine(@Value("8") int cylinderCount) {
    this.cylinderCount = cylinderCount;
  }

  @Override
  public String toString() {
    return "Engine{" +
            "cylinderCount=" + cylinderCount +
            '}';
  }
}
