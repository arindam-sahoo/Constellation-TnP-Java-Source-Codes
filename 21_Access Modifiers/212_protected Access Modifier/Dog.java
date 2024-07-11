public class Dog extends Animal {
    // Constructor calling the superclass constructor
    public Dog(String species) {
        super(species);
    }
    
    // Method overriding the displaySpecies() method
    @Override
    protected void displaySpecies() {
        System.out.println("Dog species: " + species);
    }
    
    // Method specific to Dog class
    public void bark() {
        System.out.println("Woof!");
    }
}