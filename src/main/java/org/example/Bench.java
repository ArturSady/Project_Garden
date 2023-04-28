package org.example;

public class Bench {
    private String materialType;

    public Bench(String materialType) {
        this.materialType = materialType;
    }

    @Override
    public String toString() {
        return "Bench{" +
                "materialType='" + materialType + '\'' +
                '}';
    }
}
