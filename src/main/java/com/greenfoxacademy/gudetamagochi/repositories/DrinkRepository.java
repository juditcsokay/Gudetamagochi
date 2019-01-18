package com.greenfoxacademy.gudetamagochi.repositories;

import com.greenfoxacademy.gudetamagochi.models.Drink;

import java.util.List;

public interface DrinkRepository {

  public Drink getDrinkByName(String name);
  public List<Drink> getDrinks();
}
