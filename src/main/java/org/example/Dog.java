package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dog {
   private List<String> tricks = new ArrayList<>();
    private String name;

    public Dog(String name, List<String> tricks)  {
        this.name = name;
        this.tricks = tricks;
    }
    public void play(List<String> tricks){
        Random random = new Random();
        int s = tricks.size();
        System.out.println(name + " " + tricks.get(random.nextInt(s)));
    }

    @Override
    public String toString() {
        return "Dog{" +
                "tricks=" + tricks +
                ", name='" + name + '\'' +
                '}';
    }
}
