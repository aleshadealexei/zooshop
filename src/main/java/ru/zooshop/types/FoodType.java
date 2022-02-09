package ru.zooshop.types;

public enum FoodType {
    ALL("Всеядный"),
    VEGAN("Травоядный"),
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
