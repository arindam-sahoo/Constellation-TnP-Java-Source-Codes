class Car extends Thread {
    public void run() {
        for(int i=1; i<=100; i++) {
            System.out.println("Selling Car"+i);
        }
    }
}

class Dog extends Thread {
    public void run() {
        for(int i=1; i<=100; i++) {
            System.out.println("Adopting Dog"+i);
        }
    }
}

public class Main1 {
    public static void main(String args[]) {
        Car ob1 = new Car();
        Dog ob2 = new Dog();

        ob1.start();
        ob2.start();
    }
}