package com.example.reve.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

  @GetMapping("/dashboard")
  public String dashboard() {
    return "admin/dashboard";
  }

  @GetMapping("/product/list")
  public String productList() {
    return "admin/product/list";
  }

  @GetMapping("/product/add")
  public String addProduct() {
    return "admin/product/add";
  }

  @GetMapping("/product/edit")
  public String editProduct() {
    return "admin/product/edit";
  }

  @GetMapping("/order/list")
  public String orderList() {
    return "admin/order/list";
  }

  @GetMapping("/member/list")
  public String memberList() {
    return "admin/member/list";
  }
}
