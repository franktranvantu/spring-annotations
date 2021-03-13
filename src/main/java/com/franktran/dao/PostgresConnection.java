package com.franktran.dao;

import org.springframework.stereotype.Component;

@Component("postgres")
public class PostgresConnection implements DatabaseConnectable {

  @Override
  public String connect() {
    return "Connecting using Postgres";
  }
}
