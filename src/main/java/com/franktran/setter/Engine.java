package com.franktran.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("setter")
public class Engine {

  private int cylinderCount;

  public void setCylinderCount(@Value("8")int cylinderCount) {
    this.cylinderCount = cylinderCount;
  }

  @Override
  public String toString() {
    return "Engine{" +
            "cylinderCount=" + cylinderCount +
            '}';
  }
}
