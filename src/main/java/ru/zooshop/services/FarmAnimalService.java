package ru.zooshop.services;

import ru.zooshop.domain.AnimalTypeEntity;
import ru.zooshop.domain.FarmAnimal;

import java.util.List;

public interface FarmAnimalService {
    FarmAnimal addBank(FarmAnimal farmAnimal);
    void delete(int id);
    FarmAnimal getByName(String name);
    FarmAnimal editBank(FarmAnimal farmAnimal);
    List<FarmAnimal> getAll();
}
