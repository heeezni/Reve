package com.example.reve.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

  @GetMapping("/notice/list")
  public String noticeList() {
    return "user/board/notice/list";
  }

  @GetMapping("/notice/detail")
  public String noticeDetail() {
    return "user/board/notice/detail";
  }

  @GetMapping("/qna/list")
  public String qnaList() {
    return "user/board/qna/list";
  }

  @GetMapping("/qna/detail")
  public String qnaDetail() {
    return "user/board/qna/detail";
  }

  @GetMapping("/qna/form")
  public String qnaForm() {
    return "user/board/qna/form";
  }
}
