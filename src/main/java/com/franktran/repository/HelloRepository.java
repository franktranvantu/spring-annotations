package com.franktran.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

  public String hello() {
    return "index";
  }
}
