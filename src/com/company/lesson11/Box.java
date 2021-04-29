package com.company.lesson11;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    ArrayList<T> arrayList;
    private final ArrayList<T> box;

    public Box(ArrayList<T> box) {

        this.box=box;

    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(getWeightBox(anotherBox) - getWeightBox(box))<0.01;
    }

    private float getWeightBox(ArrayList<T> box) {
        float weight = 0;
        for (T t : box) {
            weight+=t.getWeight();
        }
        return weight;
    }

    private float getWeightBox(Box<?> anotherBox) {
        float weight = 0;
        for (Fruit fruit : anotherBox.getBox()) {
            weight+=fruit.getWeight();
        }
        return weight;
    }



    private ArrayList<T> getBox() {
        return box;
    }

    public void add(T fruit) {
        this.box.add(fruit);
    }

    public void pourOver(Box<T> box) {
        for (T t : this.box) {
            box.add(t);
            this.box.remove(t);
        }
    }



}
