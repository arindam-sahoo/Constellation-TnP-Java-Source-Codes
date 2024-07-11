class Car implements Runnable {
    private static int carCount = 0;

    // Synchronized method
    public synchronized void sellCar() {
        carCount++;
        System.out.println("Selling Car" + carCount);
    }

    public void run() {
        for(int i = 1; i <= 100; i++) {
            sellCar();
        }
    }
}

class Dog implements Runnable {
    private static int dogCount = 0;

    // Synchronized method
    public synchronized void adoptDog() {
        dogCount++;
        System.out.println("Adopting Dog" + dogCount);
    }

    public void run() {
        for(int i = 1; i <= 100; i++) {
            adoptDog();
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Car car = new Car();
        Dog dog = new Dog();

        Thread thread1 = new Thread(car);
        Thread thread2 = new Thread(dog);

        thread1.start();
        thread2.start();
    }
}