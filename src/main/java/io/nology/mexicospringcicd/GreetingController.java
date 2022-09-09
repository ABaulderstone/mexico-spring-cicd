package io.nology.mexicospringcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GreetingController {
  @GetMapping
  public String Hello() {
    return "Hello, world";
  }
  
}
