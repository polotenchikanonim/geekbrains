package com.company.lesson6;

//Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
// Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
// У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать,
// собака 10 м.).
//* Добавить подсчет созданных котов, собак и животных.


import com.company.lesson6.animal.Animal;

public class Main {

    public static void main(String[] args) {
        Animal dogBobik = new Dog("Бобик", "black", 1);
        dogBobik.run(1500);
        dogBobik.swim(1500);

        Animal catBobik = new Cat("Мурзик", "black", 1);
        catBobik.run(1500);
        catBobik.swim(1500);

    }
}
