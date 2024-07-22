package jp.co.systemi.study.math_quiz.controller;

import jp.co.systemi.study.math_quiz.domain.Wine;
import jp.co.systemi.study.math_quiz.form.WineForm;
import jp.co.systemi.study.math_quiz.service.WineService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@Log4j2
@RequestMapping("/wine")
public class WineController {

  private final WineService wineService;

  @Autowired
  public WineController(WineService wineService) {
    this.wineService = wineService;
  }

  @GetMapping
  public String index(Model model,
                      @ModelAttribute("createdWine") Wine createdWine
          , @ModelAttribute("deletedWine") Wine deletedWine) {
    List<Wine> wineList = wineService.findAll();
    model.addAttribute("wineList", wineList);
    model.addAttribute("num", wineList.size());
    model.addAttribute("createdId", createdWine.getId());
    model.addAttribute("deletedId", deletedWine.getId());
    log.debug(createdWine);
    return "wine/index";
  }


  @PostMapping
  public String create(
          @ModelAttribute() @Validated WineForm wineForm,
          RedirectAttributes redirectAttributes) {
    var createdWine = wineService.insert(wineForm.getToxic());
    redirectAttributes.addFlashAttribute("createdWine", createdWine);
    return "redirect:/wine";
  }

  @DeleteMapping("{id}")
  public String delete(@PathVariable Integer id,
                       RedirectAttributes redirectAttributes) {
    var wine = Wine.create(id);
    wineService.delete(id);
    redirectAttributes.addFlashAttribute("deletedWine", wine);
    return "redirect:/wine";
  }


}
