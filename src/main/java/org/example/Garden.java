package org.example;

import java.util.ArrayList;
import java.util.List;

public class Garden {
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
    }
    public Garden(Bench bench, List<Flower> flowers, int numOfTrees) {
        this.bench = bench;
        this.flowers = flowers;
        this.trees = new ArrayList<>();
        for (int i = 0; i <numOfTrees; i++) {
            this.trees.add(new Tree());
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
