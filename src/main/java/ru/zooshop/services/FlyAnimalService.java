package ru.zooshop.services;

import ru.zooshop.domain.FarmAnimal;
import ru.zooshop.domain.FlyAnimal;

import java.util.List;

public interface FlyAnimalService {
    FlyAnimal addBank(FarmAnimal FlyAnimal);
    void delete(int id);
    FlyAnimal getByName(String name);
    FlyAnimal editBank(FarmAnimal farmAnimal);
    List<FlyAnimal> getAll();
}
