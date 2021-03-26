package com.company.lesson1;

public class Main {

    public static void main(String[] args) {

        byte b = 3;
        short s = 30000;
        int i = 4000;
        long l = 2147483648L;

        float f = 24.5F;
        double d = 23.5;
        char c = 'A';
        boolean True = true;

    }

    public static float taskThree(float a, float b, float c, float d){
        return a * (b+(c/d));
    }

    public static boolean taskFour(int a, int b) {
        return 10 < a + b && a + b <= 20;
    }

    public static void taskFive(int a){
        if (a < 0){
            System.out.println("отрицательное");
        }
        else {
            System.out.println("положительное");
        }
    }

    public static boolean taskSix(int a){
        return a < 0;
    }

    public static void taskSeven(String name){
        System.out.println("Привет, " + name);
    }
}