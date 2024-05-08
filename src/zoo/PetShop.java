package oop.petshop;

import java.util.Arrays;

public class PetShop {
    // Fields / Properties
    private String name;
    private Pet[] petStock; // array of Pets

    // Methods
    // - Constructors
    public PetShop(String name, int capacity) {
        this.name = name;
        this.petStock = new Pet[capacity]; // array will be empty!
        initStock();
    }

    /**
     * initialize the stock of pets
     */
    private void initStock() {
        for (int i = 0; i < petStock.length; i++) {
            if (i % 2 == 0) {
                petStock[i] = new Cat("Mia", 2, true);
            } else {
                petStock[i] = new Hamster("Cappucino", 1, false);
            }
            // switch this off, if you want to enjoy readability on your console
            // this is to show the advantage of polymorphism when using an interface
            petStock[i].cuddle();
        }
    }

    public Pet[] getPetStock() {
        return petStock;
    }

    /**
     * print out the full pet stock
     */
    public void printStock() {
        System.out.println(Arrays.toString(this.petStock));
    }

    @Override
    public String toString() {
        return this.name + "-Shop 🛒 " + " Pet Capa = " + this.petStock.length;
    }
}
