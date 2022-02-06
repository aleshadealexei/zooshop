package ru.zooshop.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import ru.zooshop.types.FoodType;

import javax.persistence.*;

@Entity
@Data
public class FoodTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Column(name = "food_type")
    private FoodType foodType;
}
