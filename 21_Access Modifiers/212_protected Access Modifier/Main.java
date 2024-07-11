public class Main {
    public static void main(String[] args) {
        // Creating an object of Dog class
        Dog dog = new Dog("Canine");
        
        // Accessing protected variable from superclass
        dog.species = "Canine"; // Allowed because Dog is subclass of Animal
        
        // Calling protected method from superclass
        dog.displaySpecies(); // Calls overridden method in Dog class
        
        // Calling method specific to Dog class
        dog.bark();
    }
}