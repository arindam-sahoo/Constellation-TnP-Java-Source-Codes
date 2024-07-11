abstract class Dog {
    public Dog(){
        System.out.println("I am a Constructor of the Dog Class.");
    }

    public void bark() {
        System.out.println("Woof!!");
    }

    abstract public void showBreed();
}

class Beagle extends Dog {
    @Override
    public void showBreed() {
        System.out.println("Dog Breed : Beagle");
    }
}

class GoldenR extends Dog {
    @Override
    public void showBreed() {
        System.out.println("Dog Breed : Golden Retriever");
    }
}

abstract class Labrador extends Dog {
    public void greet() {
        System.out.println("Labrador says Hello");
    }
}

public class Main {
    public static void main(String args[]) {
        // Dog ob = new Dog();      // Error : Cannot Instantiate Abstract Classes
        Beagle ob1 = new Beagle();
        ob1.showBreed();
        GoldenR ob2 = new GoldenR();
        ob2.showBreed();
        // Labrador ob3 = new Labrador();// Error : Cannot Instantiate Abstract Classes
    }
}
