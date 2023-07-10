package com.prove.streamm;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private static List<Person> persons = new ArrayList<>();

     static {
        Person p1 = new Person("Nata", "Pust", 36);
        Person p2 = new Person("Tanya", "Pust", 34);
        Person p3 = new Person("HALYA", "Pust", 56);
        Person p4 = new Person("Gianni", "Pust", 56);
        Person p5 = new Person("Roman", "Pust", 7);
        Person p6 = new Person("Nata", "Nayda", 37);
        Person p7 = new Person("Inna", "Levc", 36);
        Person p8 = new Person("KATYA", "Golov", 50);
        Person p9 = new Person("Natan", "Pust", 2);
        Person p10 = new Person("Nata", "Rust", 36);

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.add(p6);
        persons.add(p7);
        persons.add(p8);
        persons.add(p9);
        persons.add(p10);
    }

    public static List<Person> getPersons(){
         return persons;
    }

}