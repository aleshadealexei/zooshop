package ru.zooshop.domain;

import com.sun.istack.NotNull;
import ru.zooshop.types.AnimalType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AnimalTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private AnimalType animalType;
}
