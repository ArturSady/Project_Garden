package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       // List<String> tricks = new ArrayList<>();
        List<Flower> flowers = new ArrayList<>();
//        tricks.add("Daj głos");
//        tricks.add("Daj łape");
//        tricks.add("Pies zdechł");
//        tricks.add("Siad");
        Tree tree1 = new Tree();

        System.out.println(tree1);
        tree1.fruitingTree();
        System.out.println(tree1);
        tree1.pickFruit();
        System.out.println(tree1);
        System.out.println();

        Bench bench = new Bench("Drewno");
        System.out.println(bench);
        System.out.println();


        System.out.println("*************");
        Dog dog = new Dog("Burek");
        System.out.println(dog);
        dog.play();
        System.out.println();
        System.out.println("************");

        Flower flower1 = new Flower("Róża", FlowerColor.CZERWONY);
        System.out.println(flower1);
        System.out.println();
        Flower flower2 = new Flower("Stokrotka");
        System.out.println(flower2);
        Flower flower3 = new Flower("Tulipan");
        Flower flower4 = new Flower("Lilia");
        flower1.blooms();
        System.out.println(flower1);
        System.out.println();
        flowers.add(flower1);
        flowers.add(flower2);
        flowers.add(flower3);
        flowers.add(flower4);

        Garden garden = new Garden(bench, flowers, 5, dog);
        System.out.println();
        System.out.println(garden);
        System.out.println();
        garden.goToGarden();
        System.out.println("********");

        Garden garden1 = new Garden(bench, flowers, 2);
        garden1.goToGarden();
        System.out.println("*****");

        System.out.println(garden1);
        garden1.waterTheFlowers();
        System.out.println();
        System.out.println(garden1);
        System.out.println("************");
        garden1.outOfGarden();
        System.out.println(garden1);




    }
}