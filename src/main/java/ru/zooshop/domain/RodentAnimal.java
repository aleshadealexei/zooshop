package ru.zooshop.domain;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class RodentAnimal extends Animal{
    @NotNull
    private double runSpeed;

    private double tailLenght;

    @NotNull
    private boolean isDangerours;

    @Override
    public String characteristic() {
        return super.characteristic() +
                "Скорость бега: %s \n".formatted(runSpeed) +
                "Скорость полета: %s \n".formatted(tailLenght) +
                "Опасный: %s \n".formatted(isDangerours ? "ДА" : "НЕТ");
    }
}
