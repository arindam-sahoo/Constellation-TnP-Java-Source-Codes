class Car implements Runnable {
    private static int carCount = 0;
    private static final Object lock = new Object();

    public void run() {
        for(int i = 1; i <= 100; i++) {
            sellCar();
        }
    }

    public void sellCar() {
        synchronized(lock) {
            carCount++;
            System.out.println("Selling Car" + carCount);
        }
    }
}

class Dog implements Runnable {
    private static int dogCount = 0;
    private static final Object lock = new Object();

    public void run() {
        for(int i = 1; i <= 100; i++) {
            adoptDog();
        }
    }

    public void adoptDog() {
        synchronized(lock) {
            dogCount++;
            System.out.println("Adopting Dog" + dogCount);
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