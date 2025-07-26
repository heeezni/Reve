package com.example.reve.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop/order")
public class OrderController {

  @GetMapping("/checkout")
  public String checkout() {
    return "user/order/checkout";
  }

  @GetMapping("/confirmation")
  public String orderConfirmation() {
    return "user/order/confirmation";
  }
}
