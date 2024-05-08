package oop.petshop;

public class Area {

    private String type;
    private Pet[] pets;
    private int size;

    // default constructor
    public Area(String name){
        this.type = name;
        this.pets = new Pet[5];
        this.size = 0;
    }

    public void add(Pet pet) {
        if (size < pets.length) {
            this.pets[size++] = pet;
        } else {
            System.out.println("Pets are full");
        }
    }

    public String getType() {
        return type;
    }

    public int getPetsNumber(){
        return this.size;
    }




}
