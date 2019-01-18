package com.greenfoxacademy.gudetamagochi.repositories;

import com.greenfoxacademy.gudetamagochi.models.Gudetama;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TamaRepositoryImpl implements TamaRepository {

    private Map<String, Gudetama> tamas;

    public TamaRepositoryImpl() {
      tamas = new HashMap<>();
    }

    @Override
    public Gudetama findOneById(String name) {
      return tamas.get(name);
    }

    @Override
    public void save(Gudetama gudetama) {
      tamas.put(gudetama.getName(), gudetama);
    }
}
