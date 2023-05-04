package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dog {
    List<String> tricks = new ArrayList<>();
    private String name;

    public Dog(String name)  {
        this.name = name;
        this.tricks = tricks;
    }
    public void play(){
        addTricks();
        Random random = new Random();
        int s = tricks.size();
        System.out.println(name + " " + tricks.get(random.nextInt(s)));
    }
    public void addTricks(){
        tricks.add("Daj głos");
        tricks.add("Daj łape");
        tricks.add("Pies zdechł");
        tricks.add("Siad");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "tricks=" + tricks +
                ", name='" + name + '\'' +
                '}';
    }
}
