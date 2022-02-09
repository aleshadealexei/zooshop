package ru.zooshop.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zooshop.domain.Animal;
import ru.zooshop.domain.AnimalTypeEntity;
import ru.zooshop.repos.AnimalRepo;
import ru.zooshop.repos.AnimalTypeRepo;
import ru.zooshop.services.AnimalService;
import ru.zooshop.services.AnimalTypeService;
import ru.zooshop.types.AnimalType;

import java.util.List;

@Service
public class AnimalTypeServiceImpl implements AnimalTypeService {
    @Autowired
    public AnimalTypeRepo animalTypeRepo;

    @Override
    public AnimalTypeEntity addAnimalType(AnimalTypeEntity animal) {
        animalTypeRepo.save(animal);
        return animal;
    }

    @Override
    public void delete(int id) {
        animalTypeRepo.deleteById(id);
    }

    @Override
    public AnimalTypeEntity getByName(String name) {
        return animalTypeRepo.findAnimalTypeEntityByAnimalType(name);
    }

    @Override
    public AnimalTypeEntity editAnimalType(AnimalTypeEntity animal) {
        animalTypeRepo.save(animal);
        return null;
    }

    @Override
    public List<AnimalTypeEntity> getAll() {
        return animalTypeRepo.findAll();
    }
}
