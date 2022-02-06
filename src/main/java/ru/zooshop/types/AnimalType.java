package ru.zooshop.types;

public enum AnimalType {
    BIG("Крупный"),
    RODENT("Грызун"),
    FLY("Летающий");

    String value;
    AnimalType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
