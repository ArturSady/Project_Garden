package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> tricks = new ArrayList<>();
        tricks.add("Daj głos");
        tricks.add("Daj łape");
        tricks.add("Pies zdechł");
        tricks.add("Siad");
        Tree tree = new Tree();
        System.out.println(tree);
        System.out.println();

        Bench bench = new Bench("Drewno");
        System.out.println(bench);
        System.out.println();



        Dog dog = new Dog("Burek", tricks);
        System.out.println(dog);
        dog.play(tricks);
    }
}