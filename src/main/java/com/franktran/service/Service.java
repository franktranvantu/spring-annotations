package com.franktran.service;

import com.franktran.dao.DatabaseConnectable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Service {

  private DatabaseConnectable databaseConnectable;

  public Service(@Qualifier("postgres") DatabaseConnectable databaseConnectable) {
    this.databaseConnectable = databaseConnectable;
  }

  public String getConnection() {
    return databaseConnectable.connect();
  }
}
