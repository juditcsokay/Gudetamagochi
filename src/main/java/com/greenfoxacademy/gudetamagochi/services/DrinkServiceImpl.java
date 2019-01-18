package com.greenfoxacademy.gudetamagochi.services;

import com.greenfoxacademy.gudetamagochi.models.Drink;
import com.greenfoxacademy.gudetamagochi.repositories.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkServiceImpl implements DrinkService{

  @Autowired
  DrinkRepository drinkRepository;

  @Override
  public List<Drink> getAllDrink() {
    return drinkRepository.getDrinks();
  }

  @Override
  public Drink getDrinkByName(String drinkName) {
    return drinkRepository.getDrinkByName(drinkName);
  }
}
