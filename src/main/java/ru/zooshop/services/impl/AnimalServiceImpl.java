package ru.zooshop.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zooshop.domain.Animal;
import ru.zooshop.repos.AnimalRepo;
import ru.zooshop.services.AnimalService;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    public AnimalRepo animalRepo;
    @Override
    public Animal addAnimal(Animal animal) {
        animalRepo.save(animal);
        return animal;
    }

    @Override
    public void delete(int id) {
        animalRepo.deleteById(id);
    }

    @Override
    public Animal getByName(String name) {
        animalRepo.findAnimalByName(name);
        return null;
    }

    @Override
    public Animal editAnimal(Animal animal) {
        animalRepo.save(animal);
        return null;
    }

    @Override
    public List<Animal> getAll() {

        return animalRepo.findAll();
    }
}
