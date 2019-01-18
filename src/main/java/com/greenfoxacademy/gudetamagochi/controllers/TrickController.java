package com.greenfoxacademy.gudetamagochi.controllers;

import com.greenfoxacademy.gudetamagochi.models.Gudetama;
import com.greenfoxacademy.gudetamagochi.models.Trick;
import com.greenfoxacademy.gudetamagochi.repositories.TrickRepositoryImpl;
import com.greenfoxacademy.gudetamagochi.services.TamaService;
import com.greenfoxacademy.gudetamagochi.services.TamaServiceImpl;
import com.greenfoxacademy.gudetamagochi.services.TrickService;
import com.greenfoxacademy.gudetamagochi.services.TrickServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TrickController {

  private TamaService tamaService;

  @Autowired
  public TrickController(TamaServiceImpl tamaService) {
    this.tamaService = tamaService;
  }

  @Autowired
  TrickService trickService;


  @GetMapping("/{name}/trickcenter")
  public String renderTrickCenterPage(@PathVariable("name") String name, Model model) {
    model.addAttribute("trickList", trickService.getAllTrick());
    model.addAttribute("gudetama", tamaService.getTama(name));
    return "trickcenter";
  }

  @PostMapping("/{name}/learn")
  public String learnTricks(@PathVariable("name") String name, @ModelAttribute(value = "newtrick") String trickName) {
    tamaService.addTrickToTama(trickService.getTrickByName(trickName), name);
    return "redirect:/" + name;
  }
}
