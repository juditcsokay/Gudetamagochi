package com.greenfoxacademy.gudetamagochi.services;

import com.greenfoxacademy.gudetamagochi.models.Drink;
import com.greenfoxacademy.gudetamagochi.models.Food;
import com.greenfoxacademy.gudetamagochi.models.Gudetama;
import com.greenfoxacademy.gudetamagochi.models.Trick;

public interface TamaService {

  void login(String name);
  Gudetama getTama(String name);
  void addTrickToTama(Trick trick, String tamaName);
  void addFoodToTama(Food food, String foodName);
  void addDrinkToTama(Drink drink, String drinkName);
}
