package ru.zooshop.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zooshop.domain.RodentAnimal;

public interface RodentAnimalRepo extends JpaRepository<RodentAnimal, Integer> {
}
