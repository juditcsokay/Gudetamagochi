package com.greenfoxacademy.gudetamagochi.repositories;

import com.greenfoxacademy.gudetamagochi.models.Food;

import java.util.List;

public interface FoodRepository {

  public Food getFoodByName(String name);
  public List<Food> getDishes();
}
