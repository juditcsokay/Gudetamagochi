package com.greenfoxacademy.gudetamagochi.models;

import java.util.ArrayList;
import java.util.List;

public class Gudetama {

  private String name;
  private Food food;
  private Drink drink;
  private List<Trick> tricks;

  public Gudetama() {
    this("name");
  }

  public Gudetama(String name) {
    this.name = name;
    tricks = new ArrayList<>();
    this.food = new Food("food");
    this.drink = new Drink("drink");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Food getFood() {
    return food;
  }

  public void setFood(Food food) {
    this.food = food;
  }

  public List<Trick> getTricks() {
    return tricks;
  }

  public void setTricks(List<Trick> tricks) {
    this.tricks = tricks;
  }

  public void addTrick(Trick trick) {
   tricks.add(trick);
  }

  public Drink getDrink() {
    return drink;
  }

  public void setDrink(Drink drink) {
    this.drink = drink;
  }
}
