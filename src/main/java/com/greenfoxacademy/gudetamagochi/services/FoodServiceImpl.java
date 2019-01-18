package com.greenfoxacademy.gudetamagochi.services;

import com.greenfoxacademy.gudetamagochi.models.Food;
import com.greenfoxacademy.gudetamagochi.repositories.FoodRepository;
import com.greenfoxacademy.gudetamagochi.repositories.FoodRepositoryImpl;
import com.greenfoxacademy.gudetamagochi.repositories.TamaRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

  @Autowired
  FoodRepository foodRepository;

  @Override
  public List<Food> getAllFood() {
    return foodRepository.getDishes();
  }

  @Override
  public Food getFoodByName(String foodName) {
    return foodRepository.getFoodByName(foodName);
  }
}
