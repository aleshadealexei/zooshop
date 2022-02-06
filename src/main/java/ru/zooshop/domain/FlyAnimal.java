package ru.zooshop.domain;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.Data;

import javax.persistence.Entity;

/**
 * Летающие животные
 */
@Entity
@Data
public class FlyAnimal extends Animal {
    @NotNull
    private int flySpeed;

    @Nullable
    private boolean isPirate;

    @NotNull
    private boolean windCount;

    @Override
    public String characteristic() {
        return super.characteristic() +
                "Колчество крыльев: %s \n".formatted(windCount) +
                "Скорость полета: %s \n".formatted(flySpeed) +
                "Подходит пиратам: %s \n".formatted(isPirate ? "ДА" : "НЕТ");
    }
}
