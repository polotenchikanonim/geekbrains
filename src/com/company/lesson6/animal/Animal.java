package com.company.lesson6.animal;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;
    protected int limit_run;

    public Animal(String name, String color, int age, int limit_run) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.limit_run = limit_run;
    }

//    public abstract void run(int meters);
//    @Override

    public void run(int meters) {
        if (meters > limit_run) {
            meters = limit_run;
        }
        System.out.println(name + " пробежал " + meters + " м.");
    }

    public abstract void swim(int meters);

}
