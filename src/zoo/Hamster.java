package oop.petshop;

public class Hamster implements Pet {

    private String name;
    private int age;
    private boolean isAwake;

    public Hamster(String name, int age, boolean isAwake) {
        this.name = name;
        this.age = age;
        this.isAwake = isAwake;
    }

    public void runAsHell() {
        System.out.println("Running 🐹");
    }

    @Override
    public void cuddle() {
        System.out.println("🐹 " + this.name + " loves cuddling...");
    }

    @Override
    public String toString() {
        return "Hamster: " + this.name;
    }
}
