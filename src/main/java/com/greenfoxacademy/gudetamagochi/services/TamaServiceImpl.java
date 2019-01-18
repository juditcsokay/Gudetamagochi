package com.greenfoxacademy.gudetamagochi.services;

import com.greenfoxacademy.gudetamagochi.models.Drink;
import com.greenfoxacademy.gudetamagochi.models.Food;
import com.greenfoxacademy.gudetamagochi.models.Gudetama;
import com.greenfoxacademy.gudetamagochi.models.Trick;
import com.greenfoxacademy.gudetamagochi.repositories.TamaRepository;
import com.greenfoxacademy.gudetamagochi.repositories.TamaRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TamaServiceImpl implements TamaService{

  private TamaRepository tamaRepository;

  @Autowired
  public TamaServiceImpl(TamaRepositoryImpl tamaRepository) {
    this.tamaRepository = tamaRepository;
  }

  @Override
  public void login(String name) {
    if (tamaRepository.findOneById(name) == null) {
      tamaRepository.save(new Gudetama(name));
    }
  }

  @Override
  public Gudetama getTama(String name) {
    return tamaRepository.findOneById(name);
  }

  @Override
  public void addTrickToTama(Trick trick, String tamaName) {
    tamaRepository.findOneById(tamaName).addTrick(trick);
  }

  @Override
  public void addFoodToTama(Food food, String tamaName) {
    tamaRepository.findOneById(tamaName).setFood(food);
  }

  @Override
  public void addDrinkToTama(Drink drink, String tamaName) {
    tamaRepository.findOneById(tamaName).setDrink(drink);
  }

}
