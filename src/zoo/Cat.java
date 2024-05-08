package oop.petshop;

public class Cat extends Feline {
    public Cat(String name, int age, boolean isPottyTrained) {
        super(name, age, isPottyTrained);
    }

    @Override
    public void cuddle() {
        // super.cuddle();  // Purrrrrrr
        System.out.println("Meouw"); // Meouw
    }

    @Override
    public void lookFunny() {
        System.out.println("👀");
    }

    @Override
    public String toString() {
        return super.toString() + " I am a cutie 🤩";
    }
}
