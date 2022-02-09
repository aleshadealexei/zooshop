package ru.zooshop.domain;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Inheritance(
        strategy = InheritanceType.JOINED
)
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private int age;

    @NotNull
    @Column(name = "max_age")
    private int maxAge;

    @NotNull
    private String name;

    // в первые периоды у животных сложно определить пол
    private String gender;

    @NotNull
    @OneToOne
    private AnimalTypeEntity type;

    @NotNull
    @OneToOne
    private FoodTypeEntity typeOfFood;

    @NotNull
    private int iq;

    @NotNull
    private double length;

    @NotNull
    private double width;

    @NotNull
    private double height;

    @NotNull
    private String color;

    public String characteristic() {
        return String.format("Имя: %s\n".formatted(name) +
                "Тип животного: %s \n ".formatted(type) +
                "Пол %s  \n".formatted(gender) +
                "Уровень IQ: %s  \n".formatted(iq) +
                "Размеры: %s длина, %s ширина, %s высота  \n".formatted(length, width, height) +
                "Возраст %s из максимального %s \n ".formatted(age, maxAge) +
                "Тип питания: %s  \n".formatted(typeOfFood) +
                "Окрас: %s \n".formatted(color));
    }

    public String cardText() {
        return String.format("Имя: %s\n".formatted(name) +
                "Размеры: %s длина, %s ширина, %s высота  \n".formatted(length, width, height) +
                "Тип питания: %s  \n".formatted(typeOfFood));
    }


}
