package ru.zooshop.services;

import org.springframework.stereotype.Service;
import ru.zooshop.domain.Animal;

import java.util.List;

@Service
public interface AnimalService {
    Animal addAnimal(Animal animal);
    void delete(int id);
    Animal getByName(String name);
    Animal editAnimal(Animal bank);
    List<Animal> getAll();
}
