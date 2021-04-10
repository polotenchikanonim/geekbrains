package com.company.lesson6;

import com.company.lesson6.animal.Animal;

public class Cat extends Animal {
    int limit_run = 200;
    
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int meters) {
        if (meters > limit_run) meters = limit_run;
        System.out.println(name + " пробежал " + meters + " м.");
    }

    @Override
    public void swim(int meters) {
        System.out.println("кот не умеет плавать");
    }
}
