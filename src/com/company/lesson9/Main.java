package com.company.lesson9;


public class Main {

    private static final int accessSize = 4;

    public static void main(String[] args) {
        int summ;
        String[][] arr = new String[][]{
                {"1", "2", "3", "4"},
                {"2", "2", "2", "3"},
                {"1", "2", "2", "2"},
                {"2", "2", "2", "2"}
        };

        summ = convertArr(arr);
        System.out.println(summ);

    }

    public static int convertArr(String[][]  array) throws MyArraySizeException, MyArrayDataException{
        System.out.println(array.length);
        System.out.println(array[0].length);
        int sum = 0;
        if (array.length == accessSize){
            for (String[] strings : array)
                if (strings.length == accessSize) {
                    for (String string : strings) {
                        try {
                            sum = Integer.parseInt(string);
                        } catch (MyArrayDataException e) {
                            throw new MyArrayDataException("bad2");
                        }
                    }
                } else {
                    throw new MyArraySizeException("bad");
                }
        } else {
            throw new MyArraySizeException("bad");
        }
        return sum;
    }

}
