package ru.zooshop.services;

import ru.zooshop.domain.FoodTypeEntity;
import ru.zooshop.domain.RodentAnimal;

import java.util.List;

public interface RodentAnimalService {
    RodentAnimal addBank(RodentAnimal rodentAnimal);
    void delete(int id);
    RodentAnimal getByName(String name);
    RodentAnimal editBank(RodentAnimal rodentAnimal);
    List<RodentAnimal> getAll();
}
