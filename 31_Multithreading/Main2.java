class Car implements Runnable {
    public void run() {
        for(int i = 1; i <= 100; i++) {
            System.out.println("Selling Car" + i);
        }
    }
}

class Dog implements Runnable {
    public void run() {
        for(int i = 1; i <= 100; i++) {
            System.out.println("Adopting Dog" + i);
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Car car = new Car();
        Dog dog = new Dog();

        Thread thread1 = new Thread(car);
        Thread thread2 = new Thread(dog);

        thread1.start();
        thread2.start();
    }
}