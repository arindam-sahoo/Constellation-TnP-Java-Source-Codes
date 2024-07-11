public class Main {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog dog1 = new Dog("Bruno", 2);
        
        // Accessing and modifying public variables directly
        dog1.name = "Max";
        dog1.age = 5;
        
        // Calling public method to display information
        dog1.display();
    }
}