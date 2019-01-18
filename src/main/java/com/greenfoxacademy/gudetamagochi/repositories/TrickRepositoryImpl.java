package com.greenfoxacademy.gudetamagochi.repositories;

import com.greenfoxacademy.gudetamagochi.models.Trick;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TrickRepositoryImpl implements TrickRepository{

  private List<Trick> tricks;

  public TrickRepositoryImpl() {
    tricks = new ArrayList<>();
    tricks.add(new Trick ("Chillin'"));
    tricks.add(new Trick ("Backflip"));
    tricks.add(new Trick ("Relaxing"));
  }

  @Override
  public Trick getTrickByName(String name) {
    Trick trick = new Trick();
    for (int i = 0; i < tricks.size(); i++) {
      if (tricks.get(i).getTrickName().equals(name))
        trick = tricks.get(i);
    }
    return trick;
  }

  public List<Trick> getTricks() {
    return tricks;
  }

  public void setTricks(List<Trick> tricks) {
    this.tricks = tricks;
  }
}
