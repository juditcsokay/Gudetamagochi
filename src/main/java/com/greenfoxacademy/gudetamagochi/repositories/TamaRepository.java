package com.greenfoxacademy.gudetamagochi.repositories;

import com.greenfoxacademy.gudetamagochi.models.Gudetama;

public interface TamaRepository {

  Gudetama findOneById(String name);
  void save(Gudetama gudetama);

}
