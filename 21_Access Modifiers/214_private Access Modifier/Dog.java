public class Dog extends Animal {
    // Constructor calling the superclass constructor
    public Dog(String species) {
        super(species);
    }
    
    // Method specific to Dog class
    public void bark() {
        System.out.println("Woof!");
    }
}