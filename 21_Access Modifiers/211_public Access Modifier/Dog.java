public class Dog {
    // public variables
    public String name;
    public int age;
    
    // public constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // public method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}