package com.company.lesson10;

import java.util.ArrayList;
import java.util.HashMap;


public class Phonebook {

    private final HashMap<String, ArrayList<String>> phonebook;
    
    public Phonebook(){
        this.phonebook = new HashMap<>();
    }
    
    public void add(String surname, String number) {
        if (phonebook.containsKey(surname)){
            ArrayList<String> numbers = phonebook.get(surname);
            if (!numbers.contains(number)){
                numbers.add(number);
                phonebook.put(surname, numbers);
            }
        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(number);
            phonebook.put(surname, numbers);
        }
    }

    public void get(String surname) {
        if(phonebook.containsKey(surname)){
            System.out.println(phonebook.get(surname));
        } else {
            System.out.print("Нет фамилии " + surname);
        }
    }
}
