package com.greenfoxacademy.gudetamagochi.repositories;

import com.greenfoxacademy.gudetamagochi.models.Drink;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DrinkRepositoryImpl implements DrinkRepository {

  private List<Drink> drinks;

  public DrinkRepositoryImpl() {
    drinks = new ArrayList<>();
    drinks.add(new Drink("Honeydew melon lemonade"));
    drinks.add(new Drink("Elder lemonade"));
    drinks.add(new Drink("Lemonade"));
    drinks.add(new Drink("Frappe"));
    drinks.add(new Drink("Ice coffee"));
    drinks.add(new Drink("Green tea"));
    drinks.add(new Drink("Strawberry milkshake"));
  }


  @Override
  public Drink getDrinkByName(String name) {
    Drink drink = new Drink();
    for (int i = 0; i < drinks.size(); i++) {
      if (drinks.get(i).getDrinkName().equals(name)) {
        drink = drinks.get(i);
      }
    }
    return drink;
  }

  @Override
  public List<Drink> getDrinks() {
    return drinks;
  }

  public void setDrinks(List<Drink> drinks) {
    this.drinks = drinks;
  }
}
