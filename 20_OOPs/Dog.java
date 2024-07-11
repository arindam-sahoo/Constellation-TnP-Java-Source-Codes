abstract class Animal {
    abstract void sound();
}

public class Dog extends Animal {
    private String breed;
    private int age;
    private String color;

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    void bark() {
        System.out.println("Woof!");
    }

    void sound() {
        bark();
    }

    void display() {
        System.err.println("Breed : "+breed);
        System.err.println("Age : "+age);
        System.err.println("Color : "+color);
    }
}

class Husky extends Dog {
    void info() {
        System.out.println("Husky has Beautiful Eyes!");
    }
}

class Beagle extends Dog {
    void bark(){
        System.out.println("Beagle Barks Woof!");
    }
}

class TestDog {
    public static void main(String args []) {
        Dog d = new Dog();
        d.setBreed("Beagle");
        d.setAge(5);
        d.setColor("Brown");
        d.bark();
        d.display();
    }
}

class TestInheritance {
    public static void main(String args[]) {
        Husky h = new Husky();
        h.setBreed("Husky");
        h.setAge(3);
        h.setColor("White");
        h.bark();
        h.display();
        h.info();
    }
}

class TestPolymorphism {
    public static void main(String args[]) {
        Dog dog1 = new Husky();
        Dog dog2 = new Beagle();

        dog1.bark();
        dog2.bark();
    }
}

class TestEncapsulation {
    public static void main(String args []) {
        Dog d = new Dog();
        d.setBreed("German Shepard");
        d.setAge(4);
        d.setColor("Brown");
        d.bark();
        d.display();
    }
}

class TestAbstraction {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.setBreed("Rottweiler");
        d.setAge(2);
        d.setColor("Brown & Black");
        d.sound();
        d.display();
    }
}