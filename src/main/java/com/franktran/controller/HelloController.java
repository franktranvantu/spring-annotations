package com.franktran.controller;

import com.franktran.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

  private final HelloService service;

  public HelloController(HelloService service) {
    this.service = service;
  }

  @RequestMapping()
  public String hello() {
    return service.hello();
  }
}
