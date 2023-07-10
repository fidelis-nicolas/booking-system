package com.prove.streamm;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Data.getPersons();




        //potok stream
        List<Person> person2 = persons.stream()
                .filter(p -> p.getAge()>35)
                .sorted() // metodo compare to implementovanyy v class Person , e implements Comparable
                .collect(Collectors.toList());

        //vidfiltrovanyy tsikl vsi hto bilshe 35 i po alfavitu
         for (int i = 0; i < person2.size(); i++){
        System.out.println("stream --> filtered, sorted " + person2.get(i));
             }

        List<Person> person3 = persons.stream()
                .map(person -> new Person(person.getName(), person.getSurname(), person.getAge()+100))
                .collect(Collectors.toList());
        for (int j = 0; j < person3.size(); j++) {
            System.out.println("stream --> map " + person3.get(j));
      }
    }
}
