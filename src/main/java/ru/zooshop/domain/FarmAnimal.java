package ru.zooshop.domain;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;

/**
 * Деревенские животные
 */
@Entity
@Data
public class FarmAnimal extends Animal{
    @NotNull
    private double profitability;

    @NotNull
    private boolean isRiding;

    @Override
    public String characteristic() {
        return super.characteristic() +
                "Рентабельность: %s в год \n".formatted(profitability) +
                "Ездовое: %s \n".formatted(isRiding ? "Да" : "Нет");
    }
}
