package ru.zooshop.services;

import ru.zooshop.domain.FarmAnimal;
import ru.zooshop.domain.FlyAnimal;
import ru.zooshop.domain.FoodTypeEntity;

import java.util.List;

public interface FoodTypeEntityService {
    FoodTypeEntity addFoodType(FoodTypeEntity FlyAnimal);
    void delete(int id);
    FoodTypeEntity getByName(String name);
    FoodTypeEntity editFoodType(FoodTypeEntity farmAnimal);
    List<FoodTypeEntity> getAll();
}
