package com.company.lesson7;

public class Cat {

    private final String name;
    private final int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate plate) {
        if (plate.getFood() >= appetite)
            plate.decreaseFood(appetite);
    }
}