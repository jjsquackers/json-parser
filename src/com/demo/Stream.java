package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void execute(){
        List<Person> people=new ArrayList<>();
        people.add(new Person("Warren Buffett",120));
        people.add(new Person("Jeff Bezos",31));
        people.add(new Person("Bill Gates",100));
        people.add(new Person("Mark Zuckerberg",50));

        //filtering & collecting then adding to list
        List<Person> hundredsClub = people.stream()
                .filter(person -> person.billions >= 10)
                .collect(Collectors.toList());

        //displaying
        hundredsClub.forEach(person -> System.out.println(person.name));
    }
    static class Person{

        private String name;
        private int billions;

        public Person(String name, int billions) {
            this.name = name;
            this.billions = billions;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getBillions() {
            return billions;
        }

        public void setBillions(int billions) {
            this.billions = billions;
        }
    }
}
