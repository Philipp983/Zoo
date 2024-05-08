package oop.petshop;

public class Zoo {

    private Area[] areas;
    private PetShop petshop;

    public Zoo(PetShop shop) {
        this.areas = new Area[]{
                new Area("Waterworld"),
                new Area("Insects"),
                new Area("Mammals")};

/*        Area area1 = new Area("Waterworld");
        Area area2 = new Area("Insects");
        Area area3 = new Area("Mammals");*/


        this.petshop = shop;
    }

    public Pet buyPet(String petNameToBuy) {
        for (Pet ele : petshop.getPetStock()) {
            if (ele.getName().equals(petNameToBuy)) {
                return ele;
                // TODO Pet must be removed from Array
            }
        }
        return null;
    }

    public void addPetToArea(Pet pet, String areaNameToAdd) {
        for (Area ele : areas) {
            if (ele.getType().equals(areaNameToAdd)) {
                ele.add(pet);
                break;
            } else {
                System.out.println("Could not be added");
            }

        }
    }


    }
