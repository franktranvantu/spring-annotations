package com.franktran.model.fields;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@PropertySource("classpath:fields.properties")
public class Student {

  @Value("${student.name}")
  private String name;

  @Value("${student.age:10}")
  private int age;

  @Value("#{'${student.skills}'.split(',')}")
  private List<String> skills;

  @Value("#{${valuesMap}}")
  private Map<String, Integer> valuesMap;

  @Value("#{${valuesMap}.key1}")
  private Integer valuesMapKey1;

  @Value("#{${valuesMap}['unknownKey']}")
  private Integer unknownMapKey;

  @Value("#{${unknownMap : {key1: '1', key2: '2'}}}")
  private Map<String, Integer> unknownMap;

  @Value("#{${valuesMap}['unknownKey'] ?: 5}")
  private Integer unknownMapKeyWithDefaultValue;

  @Value("#{${valuesMap}.?[value>'1']}")
  private Map<String, Integer> valuesMapFiltered;

  @Value("#{systemProperties}")
  private Map<String, String> systemPropertiesMap;

  @Override
  public String toString() {
    return
        "name='" + name + '\'' +
        "\nage=" + age +
        "\nskills=" + skills +
        "\nvaluesMap=" + valuesMap +
        "\nvaluesMapKey1=" + valuesMapKey1 +
        "\nunknownMapKey=" + unknownMapKey +
        "\nunknownMap=" + unknownMap +
        "\nunknownMapKeyWithDefaultValue=" + unknownMapKeyWithDefaultValue +
        "\nvaluesMapFiltered=" + valuesMapFiltered +
        "\nsystemPropertiesMap=" + systemPropertiesMap;
  }
}
