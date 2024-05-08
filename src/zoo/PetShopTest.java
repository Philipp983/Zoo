package oop.petshop;

public class PetShopTest {
    public static void main(String[] args) {
        // Creating basic objects via constructors
        // -----------------------------------------------
        // Pet mia = new Pet("Mia", 2); // Furkans Katze 😸 - can only be created if Pet is not an interface
        // mia.cuddle();
        // System.out.println(mia);

        PetShop fettnapf = new PetShop("Fettnapf", 42);
//        System.out.println(fettnapf);
        fettnapf.printStock();

        // Polymorphism in detail
        // -----------------------------------------------
        Pet tilu = new Cat("Tilu", 3, true);
//        System.out.println(tilu);
        Pet cappu = new Hamster("Cappu",  1, false);


        // explicit casting - sadly not self-explaining ⛈
        // -----------------------------------------------
//        System.out.println(tilu.getClass().getName());
        if (cappu instanceof Hamster) {
            ((Hamster) cappu).runAsHell();
            System.out.println("Cast erfolgreich.");
        } else {
            System.out.println("Kann ich nich caRsten");
        }

        if (tilu instanceof Hamster) {
            ((Hamster) tilu).runAsHell();
            System.out.println("Cast erfolgreich.");
        } else {
            System.out.println("Kann ich nich caRsten");
        }


        // Interfaces
        // -----------------------------------------------
        Pet interfacePet = new Cat("Garfield", 32, false);
        System.out.println(interfacePet);

        //Polymorphie?
        Pet hamtaro = new Hamster("Hamtaro", 7, true);
        hamtaro.cuddle();


        //Abstract classes
        // -----------------------------------------------
        Feline f = new Cat("Tiger", 21, false);

        // anonymous inner class
        Feline f2 = new Feline("Name", 2, true) {
            @Override
            public void lookFunny() {
                System.out.println("hihi");
            }
        };



    }


}
