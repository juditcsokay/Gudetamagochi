package com.greenfoxacademy.gudetamagochi.services;

import com.greenfoxacademy.gudetamagochi.models.Trick;
import com.greenfoxacademy.gudetamagochi.repositories.TrickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrickServiceImpl implements TrickService {

  @Autowired
  TrickRepository trickRepository;

  @Override
  public List<Trick> getAllTrick() {
    return trickRepository.getTricks();
  }

  @Override
  public Trick getTrickByName(String trickName) {
    return trickRepository.getTrickByName(trickName);
  }
}
