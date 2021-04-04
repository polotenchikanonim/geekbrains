package com.company.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Random random = new Random();
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)){
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья");
                break;
            }
            computerTurn();
            printMap();
            if (checkWin(DOT_O)){
                System.out.println("Победил компьютер");
                break;
            }
        }
        System.out.println("Игра закончена");
        sc.close();
    }

    public static boolean checkDiagonal(char symbol){
        byte count;
        count = 0;
        for (byte i=0; i<SIZE; i++){
            if (map[i][i] == symbol){
                count++;
            }
        }
        if (count == DOTS_TO_WIN){
            return true;
        }
        count = 0;
        for (byte i=SIZE-1; i>=0; i--){
            if (map[i][i] == symbol){
                count++;
            }
        }
        return count == DOTS_TO_WIN;
    }

    public static boolean checkVertical(char symbol){
        for (byte i=0; i<SIZE; i++){
            byte count = 0;
            for(byte j=0; j<SIZE; j++){
                if (map[j][i] == symbol){
                    count++;
                }
            }
            if (count == DOTS_TO_WIN) return true;
        }
        return false;
    }

    public static boolean checkHorizontal(char symbol){
        for (byte i=0; i<SIZE; i++){
            byte count = 0;
            for(byte j=0; j<SIZE; j++){
                if (map[i][j] == symbol)
                    count++;
            }
            if (count == DOTS_TO_WIN) return true;
        }
        return false;
    }

    public static boolean checkWin(char symbol) {
        if (checkHorizontal(symbol)) return true;
        if (checkVertical(symbol)) return true;
        return checkDiagonal(symbol);
    }

    public static boolean isMapFull() {
        for (char[] chars : map) {
            for (int j = 0; j < map.length; j++) {
                if (chars[j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean isNotCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE)
            return true;
        return map[y][x] != DOT_EMPTY;
    }

    public static void computerTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (isNotCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (isNotCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
}
