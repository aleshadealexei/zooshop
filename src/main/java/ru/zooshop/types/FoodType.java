package ru.zooshop.types;

public enum FoodType {
    ALL("Всеядный"),
    Vegan("Травоядный"),
    PREDATOR("Хищник");

    String value;
    FoodType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
