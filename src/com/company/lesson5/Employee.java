package com.company.lesson5;

//Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//Конструктор класса должен заполнять эти поля при создании объекта.
//Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//Создать массив из 5 сотрудников.

public class Employee {
    String full_name, position, email, number_phone;
    int age;
    float salary;

    Employee(String full_name,String position,
             String email, String number_phone, int age, float salary){
        this.full_name = full_name;
        this.position = position;
        this.email = email;
        this.number_phone = number_phone;
        this.age = age;
        this.salary = salary;
    }

    void showInfo() {
        System.out.println("ФИО " + full_name);
        System.out.println("должность " + position);
        System.out.println("электронный адресс " + email);
        System.out.println("номер телефона " + number_phone);
        System.out.println("возраст " + age);
        System.out.println("зарплата " + salary);
    }

}
