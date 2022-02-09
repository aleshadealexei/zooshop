package ru.zooshop.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zooshop.domain.FoodTypeEntity;
import ru.zooshop.repos.FoodTypeRepo;
import ru.zooshop.services.FoodTypeEntityService;

import java.util.List;

@Service
public class FoodTypeEntityServiceImpl implements FoodTypeEntityService {
    @Autowired
    public FoodTypeRepo animalTypeRepo;

    @Override
    public FoodTypeEntity addFoodType(FoodTypeEntity animal) {
        animalTypeRepo.save(animal);
        return animal;
    }

    @Override
    public void delete(int id) {
        animalTypeRepo.deleteById(id);
    }

    @Override
    public FoodTypeEntity getByName(String name) {
        return animalTypeRepo.findAnimalTypeEntityByFoodType(name);
    }

    @Override
    public FoodTypeEntity editFoodType(FoodTypeEntity animal) {
        animalTypeRepo.save(animal);
        return null;
    }

    @Override
    public List<FoodTypeEntity> getAll() {
        return animalTypeRepo.findAll();
    }
}
