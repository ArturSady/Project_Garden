package org.example;

import java.util.ArrayList;
import java.util.List;

public class Garden {
   // List<String> tricks = new ArrayList<>();
  //  List<String> tricks;
    boolean dogExist;
    private Bench bench;
    private List<Flower> flowers;
    private List<Tree> trees;
    private Dog dog;

    public Garden(Bench bench, List<Flower> flowers, int numOfTrees, Dog dog) {
        this.bench = bench;
        this.flowers = flowers;
        this.trees = new ArrayList<>();
        for (int i = 0; i <numOfTrees; i++) {
            this.trees.add(new Tree());
        }
        this.dog = dog;
        dogExist = true;
    }
    public Garden(Bench bench, List<Flower> flowers, int numOfTrees) {
        this.bench = bench;
        this.flowers = flowers;
        this.trees = new ArrayList<>();
        for (int i = 0; i <numOfTrees; i++) {
            this.trees.add(new Tree());
        }
        dogExist = false;
    }
    public void goToGarden(){
        if(dogExist == true) {
            System.out.print("Wita Cię " + dog.getName() + ", ");
            dog.play();
        }if(dogExist == false) {
            System.out.println("Słyszysz szum wiatru!!");
        }
    }
    public void pickFruits() {
        int sumPickFruit = 0;

        for (Tree trees : trees) {
            //trees.pickFruit();
            sumPickFruit += trees.pickFruit();
        }
        if (sumPickFruit > 0){
            System.out.println("Zebrano " + sumPickFruit + " owoców!");
    }else{
        System.out.println("Przyjdź jutro!!!");
    }
    }

    public void waterTheFlowers(){
        for (int i = 0; i < flowers.size(); i++) {
            flowers.get(i).blooms();
        }
    }
    public void workInGarden(){
        goToGarden();
        pickFruits();
        waterTheFlowers();
    }
    public void outOfGarden(){
        for (Tree trees: trees) {
            trees.fruitingTree();
        }
        for (Flower flowers: flowers) {
            flowers.stopBlooms();

        }
    }

    @Override
    public String toString() {
        return "Garden{" +
                "bench=" + bench +
                ", flowers=" + flowers +
                ", trees=" + trees +
                ", dog=" + dog +
                '}';
    }
}
