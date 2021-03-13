package com.franktran.dao;

import org.springframework.stereotype.Component;

@Component("mysql")
public class MySqlConnection implements DatabaseConnectable {

  @Override
  public String connect() {
    return "Connecting using MySql";
  }
}
