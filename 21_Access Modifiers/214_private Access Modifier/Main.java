public class Main {
    public static void main(String[] args) {
        // Creating an object of Dog class
        Dog dog = new Dog("Canine");
        
        // Trying to access private variable directly (will cause error)
        // dog.species = "Canine"; // Error: species has private access in Animal
        
        // Trying to call private method directly (will cause error)
        // dog.displaySpecies(); // Error: displaySpecies() has private access in Animal
        
        // Using public method to access private method
        dog.showSpecies();
        
        // Calling method specific to Dog class
        dog.bark();
    }
}