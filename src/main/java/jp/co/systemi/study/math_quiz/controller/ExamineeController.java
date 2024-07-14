package jp.co.systemi.study.math_quiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ExamineeController {

  @GetMapping("/examinee")
  public String examinee(Model model) {
    model.addAttribute("name", "hoge");
    return "examinee/list";
  }

}
