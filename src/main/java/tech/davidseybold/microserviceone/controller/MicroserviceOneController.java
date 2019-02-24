package tech.davidseybold.microserviceone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroserviceOneController {

  @Value("${test.message}")
  private String message;

  @GetMapping(path = "message")
  public String message() {
    return message;
  }
}
