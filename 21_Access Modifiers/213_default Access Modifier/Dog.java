public class Dog extends Animal {
    // Constructor calling the superclass constructor
    public Dog(String species) {
        super(species);
    }
    
    // Method to display the species using the superclass method
    public void showDetails() {
        displaySpecies(); // Can call because displaySpecies() has default access and Dog is in the same package
    }
    
    // Method specific to Dog class
    public void bark() {
        System.out.println("Woof!");
    }
}