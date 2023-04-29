package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Flower {

    private String name;
    private boolean bloom = false;
    private FlowerColor flowerColor;
    List<FlowerColor> colors = Arrays.asList(FlowerColor.values());
    private List<Flower> flowers;


    public Flower(String name, FlowerColor flowerColor) {
        this.name = name;
        this.flowerColor = flowerColor;
    }

    public Flower(String name) {
        Random random = new Random();
        int s = random.nextInt(colors.size());
        this.name = name;
        this.flowerColor = colors.get(s);
    }
    public void blooms(){
        bloom = true;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", bloom=" + bloom +
                ", flowerColor=" + flowerColor +
                '}';
    }
}
