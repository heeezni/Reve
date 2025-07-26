package com.example.reve.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/coupon")
public class AdminCouponController {

  @GetMapping("/add")
  public String addCoupon() {
    return "admin/coupon/add";
  }

  @GetMapping("/edit")
  public String editCoupon() {
    return "admin/coupon/edit";
  }

  @GetMapping("/list")
  public String listCoupons() {
    return "admin/coupon/list";
  }
}
