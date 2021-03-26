package com.company.lesson2;

public class Main {
//    1) Задать целочисленный массив, состоящий из элементов 0 и 1.
//       Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
//    2) Задать пустой целочисленный массив размером 8.
//     С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
//    3) Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//       и числа меньшие 6 умножить на 2;
//    4) Создать квадратный двумерный целочисленный массив (количество строк и столбцов
//       одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    public static void main(String[] args) {
        changeArr();
        createEmptyArr();
        changeArrMultiply();
        squareArr();
    }

    public static void squareArr() {
        int l = 5;
        int[][] array = new int[l][l];
        for (int i=0; i<array.length; i++){
            array[i][i]=1;
            l--;
            array[i][l]=1;
        }
    }


    public static void changeArr(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i=0; i<arr.length; ++i){
            if(arr[i] == 1){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void createEmptyArr(){
        int[] array = new int[8];
    }

    public static void changeArrMultiply() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i=0; i<arr.length; ++i){
            if(arr[i] < 6){
                arr[i] *= 2;
            }
        }
    }
}