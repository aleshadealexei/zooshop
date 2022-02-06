package ru.zooshop.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zooshop.domain.Animal;

public interface AnimalRepo extends JpaRepository<Animal, Integer> {
}
