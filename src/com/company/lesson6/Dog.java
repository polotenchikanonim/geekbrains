package com.company.lesson6;

import com.company.lesson6.animal.Animal;

public class Dog extends Animal {
    private static final int limitRun = 500;
    private static final int limitSwim = 10;

    public static int getLimitRun() {
        return limitRun;
    }

    public Dog(String name, String color, int age) {
        super(name, color, age, getLimitRun());
    }

    @Override
    public void swim(int meters) {
        if (meters > limitSwim){
            meters = limitSwim;
        }
        System.out.println(name  + " проплыл "  + meters + " м.");
    }
}
