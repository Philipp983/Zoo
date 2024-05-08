package oop.petshop;

public abstract class Feline implements Pet {
    // fields / properties
    private String name;
    private int age;
    private boolean isPottyTrained;

    public Feline(String name, int age, boolean isPottyTrained) {
        this.name = name;
        this.age = age;
        this.isPottyTrained = isPottyTrained;
    }


    //  method
    public void purr() {
        System.out.println("Purrrrrrrrr");
    }

    @Override
    public String toString() {
        return " 🐱‍👤";
    }

    @Override
    public void cuddle() {
        purr();
    }

    public abstract void lookFunny();
}
