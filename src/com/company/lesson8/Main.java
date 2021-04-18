package com.company.lesson8;


//1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и
// прыгать (методы просто выводят информацию о действии в консоль).
//2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
// соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог
// пробежать и т.д.).
//3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.


public class Main {

    public static void main(String[] args) {
        Moving[] movings = {
                new Cat("cat_1"),
                new Robot("robot_1"),
                new Human("human_1")
        };

        Obstaclable[] obstacles = {
                new Treadmill(),
                new Wall()
        };

        for (Moving member : movings) {
            for (Obstaclable obstacle : obstacles) {
                if (obstacle.getClass().equals(Treadmill.class)) {
                    member.run();
                } else if (obstacle.getClass().equals(Wall.class)){
                    member.jump();
                }
            }
        }
    }
}