package com.example.reve.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/board")
public class AdminBoardController {

  @GetMapping("/notice/list")
  public String noticeList() {
    return "admin/board/notice/list";
  }

  @GetMapping("/notice/form")
  public String noticeForm() {
    return "admin/board/notice/form";
  }

  @GetMapping("/qna/list")
  public String qnaList() {
    return "admin/board/qna/list";
  }

  @GetMapping("/qna/reply")
  public String qnaReply() {
    return "admin/board/qna/reply";
  }
}
