package com.company.lesson6;

import com.company.lesson6.animal.Animal;

public class Dog extends Animal {
    int limit_swim = 10;
    int limit_run = 500;

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int meters) {
        if (meters > limit_run) meters = limit_run;
        System.out.println(name + " пробежал " + meters + " м.");
    }

    @Override
    public void swim(int meters) {
        if (meters > limit_swim){
            meters = limit_swim;
        }
        System.out.println(name  + " проплыл "  + meters + " м.");
    }
}
