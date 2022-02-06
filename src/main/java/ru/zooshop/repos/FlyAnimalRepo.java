package ru.zooshop.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zooshop.domain.FlyAnimal;

public interface FlyAnimalRepo extends JpaRepository<FlyAnimal, Integer> {
}
