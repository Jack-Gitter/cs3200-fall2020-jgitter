package com.example.cs3200fall2020serverjavagitter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @RequestMapping("/api/hello/string")
  public String sayHello() {
    return "Hello Jack Gitter";
  }
  @RequestMapping("/api/hello/object")
  public HelloObject sayHelloObject() {
    HelloObject obj = new HelloObject("hello Jack Gitter");
        return obj;
  }
}
