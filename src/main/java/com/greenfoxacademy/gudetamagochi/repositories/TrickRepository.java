package com.greenfoxacademy.gudetamagochi.repositories;

import com.greenfoxacademy.gudetamagochi.models.Trick;

import java.util.List;

public interface TrickRepository {

  public Trick getTrickByName(String name);

  public List<Trick> getTricks();
}
