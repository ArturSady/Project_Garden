package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Tree {
    Random random = new Random();
    ArrayList<String> trees = new ArrayList();
    private String tree1 = "Buk";
    private String tree2 = "Brzoza";
    private String tree3 = "Sosna";
    private String tree4 = "Jodła";
    private String tree5 = "Klon";
    private String tree6 = "Dąb";
    private String randomTree;
    private int amountFruit;
public void addTreeToList(){
    trees.add(tree1);
    trees.add(tree2);
    trees.add(tree3);
    trees.add(tree4);
    trees.add(tree5);
    trees.add(tree6);
}
public int getRandomAmountFruit(){
    return random.nextInt(100) * 10;
}
public void fruitingTree(){
    amountFruit += random.nextInt(100);
}
public int pickFruit(){
    int pickedFruit = amountFruit;
    System.out.println("Zebrałeś " + amountFruit + " owoców");
     amountFruit = 0;
     return pickedFruit;
}


    public Tree() {
        amountFruit = getRandomAmountFruit();
        randomTree = getRandomTree();
        trees.add(randomTree);
    }

    public String getRandomTree(){
    addTreeToList();
    int index = random.nextInt(trees.size());
    return trees.get(index);

}

    @Override
    public String toString() {
        return "Tree{" +
                "randomTree='" + randomTree + '\'' +
                ", amountFruit=" + amountFruit +
                '}';
    }
}

