package jp.co.systemi.study.math_quiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IngestionController {

  @GetMapping("/ingestion")
  public String examinees(Model model) {
    model.addAttribute("name", "hoge");
    return "ingestion/list";
  }
}
