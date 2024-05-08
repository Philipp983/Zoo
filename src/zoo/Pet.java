package oop.petshop;

public interface Pet {
    // Fields / properties
    // - Interfaces may not have private fields!
    // - If there are fields - they need to be initialized
    // - If there are fields - they are always "final", public and static (implicitly)!
    public static final String name = "Lars";
    int age = 33;

    // Methods
    // - Interfaces don't have bodies in methods - just signatures
    // - modifier public is not needed!
    // - default methods are possible: they will be used if implementing classes don't provide an own implementation
    default void cuddle() {
        tickle();
        System.out.println("Cuddle");
    }

    default String getName() {
        return this.name;
    }

    // - private methods can be used as "helper" methods
    private void tickle() {
        System.out.println("Killekille");
    }

}
