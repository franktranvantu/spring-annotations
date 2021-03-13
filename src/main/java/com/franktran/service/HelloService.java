package com.franktran.service;

import com.franktran.repository.HelloRepository;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

  private final HelloRepository repository;

  public HelloService(HelloRepository repository) {
    this.repository = repository;
  }

  public String hello() {
    return repository.hello();
  }
}
