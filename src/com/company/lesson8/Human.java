package com.company.lesson8;

public class Human implements Moving{

    private final String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println(name + " перепрыгнул стену.");
    }

    @Override
    public void run() {
        System.out.println(name + " пробежал n метров.");
    }
}