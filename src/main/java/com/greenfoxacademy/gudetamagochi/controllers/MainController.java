package com.greenfoxacademy.gudetamagochi.controllers;

import com.greenfoxacademy.gudetamagochi.services.FoodService;
import com.greenfoxacademy.gudetamagochi.services.FoodServiceImpl;
import com.greenfoxacademy.gudetamagochi.services.TamaService;
import com.greenfoxacademy.gudetamagochi.services.TamaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  private TamaService tamaService;

  @Autowired
  public MainController(TamaServiceImpl tamaService) {
    this.tamaService = tamaService;
  }

  @GetMapping("")
  public String renderTamagochiMainPage() {
    return "index";
  }

  @GetMapping("/login")
  public String renderTamagochiLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String login(@RequestParam("name") String name) {
    tamaService.login(name);
    return "redirect:/" + name;
  }

  @GetMapping("/{name}")
  public String renderProfilePage(@PathVariable("name") String name, Model model) {
    //model.addAttribute("tricklist", tamaService.getTama(name).getTricks());
    model.addAttribute("gudetama", tamaService.getTama(name));
    return "profile";
  }


}
