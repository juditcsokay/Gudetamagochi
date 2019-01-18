package com.greenfoxacademy.gudetamagochi.services;

import com.greenfoxacademy.gudetamagochi.models.Trick;

import java.util.List;

public interface TrickService {

  public List<Trick> getAllTrick();
  public Trick getTrickByName(String trickName);
}
