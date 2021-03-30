package com.company.lesson3;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            int computerNum = new Random().nextInt(10);
            int userNum;
            int attempts = 3;
            System.out.println("У вас есть 3 попытки отгадать номер");

            while (attempts > 0) {
                userNum = scanner.nextInt();

                if (userNum == computerNum) {
                    break;
                } else {
                    if (userNum < computerNum) {
                        System.out.println("Ваше число меньше");
                    } else {
                        System.out.println("Ваше число больше");
                    }
                    attempts--;
                }
            }

            System.out.println("Хотите ли вы сыграть снова? Y/N");
        } while (scanner.next().equalsIgnoreCase("Y"));
        scanner.close();
    }

}
