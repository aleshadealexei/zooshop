package ru.zooshop.services;

import ru.zooshop.domain.FarmAnimal;
import ru.zooshop.domain.FlyAnimal;
import ru.zooshop.domain.FoodTypeEntity;

import java.util.List;

public interface FoodTypeEntityService {
    FoodTypeEntity addBank(FoodTypeEntity FlyAnimal);
    void delete(int id);
    FoodTypeEntity getByName(String name);
    FoodTypeEntity editBank(FoodTypeEntity farmAnimal);
    List<FoodTypeEntity> getAll();
}
