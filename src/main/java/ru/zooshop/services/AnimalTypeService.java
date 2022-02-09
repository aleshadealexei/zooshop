package ru.zooshop.services;

import ru.zooshop.domain.Animal;
import ru.zooshop.domain.AnimalTypeEntity;
import ru.zooshop.types.AnimalType;

import java.util.List;

public interface AnimalTypeService {
    AnimalTypeEntity addAnimalType(AnimalTypeEntity animalType);
    void delete(int id);
    AnimalTypeEntity getByName(String name);
    AnimalTypeEntity editAnimalType(AnimalTypeEntity bank);
    List<AnimalTypeEntity> getAll();
}
