package com.franktran.model.setters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@PropertySource("classpath:setters.properties")
public class CollectionProvider {

  private List<String> values;

  @Autowired
  public void setValues(@Value("#{'${listOfValues}'.split(',')}") List<String> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "CollectionProvider{" +
        "values=" + values +
        '}';
  }
}
