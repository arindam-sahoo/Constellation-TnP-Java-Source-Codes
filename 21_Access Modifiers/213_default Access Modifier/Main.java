public class Main {
    public static void main(String[] args) {
        // Creating an object of Dog class
        Dog dog = new Dog("Canine");
        
        // Accessing default method and variable within the same package
        dog.showDetails();
        
        // Calling method specific to Dog class
        dog.bark();
    }
}