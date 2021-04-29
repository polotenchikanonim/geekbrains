package com.company.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        Orange orange_1 = new Orange(1.2f);
        Orange orange_2 = new Orange(1.3f);
        Apple apple_1 = new Apple(1.1f);

        ArrayList<Orange> oranges = new ArrayList<>(Arrays.asList(orange_1, orange_2));
        Box<Orange> orangeBox = new Box<>(oranges);
//        Apple[] apples = new Apple[]{apple_1};
//        Box<Apple> appleBox = new Box<>(apples);
        ArrayList<Apple> apples = new ArrayList<>(Collections.singletonList(apple_1));
        Box<Apple> appleBox = new Box<>(apples);
        
        appleBox.add(new Apple(1.2f));

        ArrayList<Orange> oranges3 = new ArrayList<>();

        Box<Orange> orangeBox3 = new Box<>(oranges3);
        orangeBox.pourOver(orangeBox3);

        String[] arrOne = {"a", "b", "c", "d"};
        changePlaceElement(arrOne, 0, 2);
        Integer[] arrTwo = {1, 2, 3, 4};
        changePlaceElement(arrTwo, 1, 3);
        System.out.println(convertArrToArrayList(arrOne));
    }

    private static <T> List<T> convertArrToArrayList(T[] array) {

        return Arrays.asList(array);
    }

    private static <T> void changePlaceElement(T[] arr, int x, int y) {
        T el = arr[x];
        arr[x] = arr[y];
        arr[y] = el;
        System.out.println(Arrays.toString(arr));
    }
}
