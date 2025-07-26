package com.example.reve.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/info")
public class InfoController {

  @GetMapping("/about")
  public String about() {
    return "info/about";
  }

  @GetMapping("/terms")
  public String terms() {
    return "info/terms";
  }

  @GetMapping("/policy")
  public String policy() {
    return "info/policy";
  }
}
