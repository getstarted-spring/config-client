package io.getstarted.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigRestController {

  @Value("${greeting.message}")
  private String greetingMessage;

  @GetMapping(path = "/")
  public String GetGreetingMessage() {
    return greetingMessage;
  }
}
