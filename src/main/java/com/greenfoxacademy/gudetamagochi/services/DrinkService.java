package com.greenfoxacademy.gudetamagochi.services;

import com.greenfoxacademy.gudetamagochi.models.Drink;

import java.util.List;

public interface DrinkService {

  public List<Drink> getAllDrink();
  public Drink getDrinkByName(String drinkName);

}
