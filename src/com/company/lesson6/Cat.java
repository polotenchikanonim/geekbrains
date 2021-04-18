package com.company.lesson6;

import com.company.lesson6.animal.Animal;

public class Cat extends Animal {

    private static final int limitRun = 200;


    public Cat(String name, String color, int age) {
        super(name, color, age, limitRun);
    }


    @Override
    public void swim(int meters) {
        System.out.println("кот не умеет плавать");
    }
}
