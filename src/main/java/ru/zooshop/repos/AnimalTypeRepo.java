package ru.zooshop.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zooshop.domain.AnimalTypeEntity;

public interface AnimalTypeRepo extends JpaRepository<AnimalTypeEntity, Integer> {
}
