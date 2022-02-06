package ru.zooshop.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zooshop.domain.FoodTypeEntity;

public interface FoodTypeRepo extends JpaRepository<FoodTypeEntity, Integer> {
}
