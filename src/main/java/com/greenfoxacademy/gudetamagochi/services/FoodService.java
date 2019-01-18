package com.greenfoxacademy.gudetamagochi.services;

import com.greenfoxacademy.gudetamagochi.models.Food;

import java.util.List;

public interface FoodService {

  public List<Food> getAllFood();
  public Food getFoodByName(String trickName);

}
