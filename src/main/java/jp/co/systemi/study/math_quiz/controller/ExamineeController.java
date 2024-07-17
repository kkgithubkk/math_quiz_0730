package jp.co.systemi.study.math_quiz.controller;

import jp.co.systemi.study.math_quiz.domain.Examinee;
import jp.co.systemi.study.math_quiz.service.ExamineeService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolver;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
@Log4j2
@RequestMapping("/examinees")
public class ExamineeController {

  private final ExamineeService examineeService;
  private final DefaultErrorViewResolver conventionErrorViewResolver;

  @Autowired
  public ExamineeController(ExamineeService examineeService,
                            DefaultErrorViewResolver conventionErrorViewResolver) {
    this.examineeService = examineeService;
    this.conventionErrorViewResolver = conventionErrorViewResolver;
  }

  @GetMapping
  public String index(Model model,
                      @ModelAttribute("createdExaminee") Examinee createdExaminee
          , @ModelAttribute("deletedExaminee") Examinee deletedExaminee) {
    List<Examinee> examinees = examineeService.findAll();
    model.addAttribute("examinees", examinees);
    model.addAttribute("num", examinees.size());
    model.addAttribute("createdId", createdExaminee.getId());
    model.addAttribute("deletedId", deletedExaminee.getId());
    log.debug(createdExaminee);
    return "examinees/index";
  }

  @PostMapping
  public String create(RedirectAttributes redirectAttributes) {
    var createdExaminee = examineeService.insert();
    redirectAttributes.addFlashAttribute("createdExaminee", createdExaminee);
    log.info("An examinee (id:{}) is added.", createdExaminee.getId());
    return "redirect:/examinees";
  }

  @DeleteMapping("{id}")
  public String delete(@PathVariable Integer id,
                       RedirectAttributes redirectAttributes) {
    var examinee = new Examinee(id);
    examineeService.delete(id);
    redirectAttributes.addFlashAttribute("deletedExaminee", examinee);
    log.info("An examinee (id:{}) is deleted.", id);
    return "redirect:/examinees";
  }

}
