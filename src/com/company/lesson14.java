package com.company;

import java.util.Arrays;

public class lesson14 {
    public static void main(String[] args) {

        int[] arr1 = {1, 1, 1, 4, 4, 1, 4, 4 };
        int[] arr2 = {1, 1, 1, 1, 1, 1 };
        int[] arr3 = {4, 4, 4, 4};
        int[] arr4 = {1, 4, 4, 1, 1, 4, 3};

        System.out.println(findPairInArr(arr1));
        System.out.println(findPairInArr(arr2));
        System.out.println(findPairInArr(arr3));
        System.out.println(findPairInArr(arr4));

        System.out.println(Arrays.toString(lastFourArr(arr4)));
        System.out.println(Arrays.toString(lastFourArr(arr2)));
    }

    public static boolean findPairInArr (int[] arr) {

        boolean one = false;
        boolean four = false;
        
        for (int a : arr) {
            if (a != 1 && a !=4)
                return false;
            if (a == 1)
                one = true;
            if (a == 4)
                four = true;
        }
        return (one && four);
    }

    public static int[] lastFourArr(int[] arr) {

        int lastFour = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                lastFour = i;

            }
        }
        if (lastFour==0){
            throw new RuntimeException();

        } else {
            return Arrays.copyOfRange(arr, lastFour, arr.length);
        }

    }
}
