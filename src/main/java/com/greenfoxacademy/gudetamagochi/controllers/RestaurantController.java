package com.greenfoxacademy.gudetamagochi.controllers;

import com.greenfoxacademy.gudetamagochi.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RestaurantController {

  private TamaService tamaService;

  @Autowired
  public RestaurantController(TamaServiceImpl tamaService) {
    this.tamaService = tamaService;
  }

  @Autowired
  FoodService foodService;

  @Autowired
  DrinkService drinkService;

  @GetMapping("/{name}/restaurant")
  public String renderRestaurantPage(@PathVariable("name") String name, Model model) {
    model.addAttribute("foodList", foodService.getAllFood());
    model.addAttribute("drinkList", drinkService.getAllDrink());
    model.addAttribute("gudetama", tamaService.getTama(name));
    return "restaurant";
  }

  @PostMapping("/{name}/feed")
  public String feedSelected(@PathVariable("name") String name, @ModelAttribute(value = "newfood") String foodName,
                                                                @ModelAttribute(value = "newdrink") String drinkName) {
    tamaService.addFoodToTama(foodService.getFoodByName(foodName), name);
    tamaService.addDrinkToTama(drinkService.getDrinkByName(drinkName), name);
    return "redirect:/" + name;
  }
}