package ru.zooshop.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zooshop.domain.FarmAnimal;

public interface FarmAnimalRepo extends JpaRepository<FarmAnimal, Integer> {
}
