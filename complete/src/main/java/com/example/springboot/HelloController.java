package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/")
  public String index() {
    return "Greetings from Spring Boot!";
  }

  @PostMapping("/goodbye")
  public String goodbye(@RequestParam(value = "name", defaultValue = "World") String name) {
    return "Goodbye, " + name + "!";
  }

}
