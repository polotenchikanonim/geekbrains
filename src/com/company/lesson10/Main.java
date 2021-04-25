package com.company.lesson10;

import java.util.*;

//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных
// слов, из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.
//2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В этот
//телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона
//по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при
//запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять лишний функционал (дополнительные поля
//(имя, отчество, адрес), взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода
//результатов проверки телефонного справочника.

public class Main {

    public static void main(String[] args) {
        showUniqKeyCount();
        Phonebook phonebook = new Phonebook();
        phonebook.add("surname_1", "8800553535");
        phonebook.add("surname_1", "8807777777");
        phonebook.get("surname_1");
        phonebook.get("surname");
    }

    private static void showUniqKeyCount() {
        int count;
        String[] words = {"word_1", "word_1", "word_2", "word_3", "word_4", "word_5", "word_6", "word_7",
                "word_8", "word_9"};
        Map<String, Integer> map = new HashMap<>();
        System.out.println(new HashSet<>(Arrays.asList(words)));
        for (String s : words) {
            if (map.containsKey(s)){
                count = map.get(s)+1;
                map.put(s, count);
            } else {
                map.put(s, 1);
            }
        }
        for (String s : map.keySet()) {
            System.out.println("Слово " + s + " встречается " + map.get(s) + " раз" );
        }
    }
}
//        for (String key : unique) {
//            System.out.println(key + ": " + Collections.frequency(words, key));
//        }
