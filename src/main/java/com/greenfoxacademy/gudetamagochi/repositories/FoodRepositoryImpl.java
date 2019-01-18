package com.greenfoxacademy.gudetamagochi.repositories;

import com.greenfoxacademy.gudetamagochi.models.Food;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FoodRepositoryImpl implements FoodRepository {

  private List<Food> dishes;

  public FoodRepositoryImpl() {
    dishes = new ArrayList<>();
    dishes.add(new Food("Sushi"));
    dishes.add(new Food("Hamburger"));
    dishes.add(new Food("Pancakes"));
    dishes.add(new Food("Roast Chicken"));
    dishes.add(new Food("Rack of Lamb"));
    dishes.add(new Food("Mufuletta sandwich"));
    dishes.add(new Food("Spinach Frittata"));
  }

  @Override
  public Food getFoodByName(String name) {
    Food food = new Food();
    for (int i = 0; i < dishes.size(); i++) {
      if (dishes.get(i).getFoodName().equals(name))
        food = dishes.get(i);
    }
    return food;
  }

  @Override
  public List<Food> getDishes() {
    return dishes;
  }

  public void setDishes(List<Food> dishes) {
    this.dishes = dishes;
  }
}
