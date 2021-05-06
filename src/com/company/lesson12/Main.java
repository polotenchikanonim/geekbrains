package com.company.lesson12;

import java.util.Arrays;

public class Main {
    
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) throws InterruptedException {
        long a;
        a = System.currentTimeMillis();
        mainThread();
        System.out.println(System.currentTimeMillis() - a);

        a = System.currentTimeMillis();
        executeInParallel();
        System.out.println(System.currentTimeMillis() - a);
    }

    public static class Foo extends Thread {
        private final float[] arr;

        Foo(float[] arr){
            this.arr = arr;
        }

        @Override
        public void run() {
            for (int i=0; i<arr.length; ++i){
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5.) * Math.cos(0.2f + i / 5.) * Math.cos(0.4f + i / 2.));
            }
        }

        public float[] getArr() {
            return arr;
        }
    }

    private static void executeInParallel() throws InterruptedException {
        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1);

        final float[] arr1 = Arrays.copyOfRange(arr, 0, HALF);
        final float[] arr2 = Arrays.copyOfRange(arr, HALF, SIZE);
        Foo a = new Foo(arr1);
        Foo b = new Foo(arr2);
        a.start();
        b.start();
        b.join();
        System.arraycopy(a.getArr(), 0, arr, 0, HALF);
        System.arraycopy(b.getArr(), 0, arr, HALF, HALF);
    }

    private static void mainThread() {
        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1);
        for (int i=0; i<arr.length; ++i){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5.) * Math.cos(0.2f + i / 5.) * Math.cos(0.4f + i / 2.));
        }
    }
}
