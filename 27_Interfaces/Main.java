interface Vehicle {
    String build = "Vehicle Build";                       // final and static

    void showPerformance();
    void showMileage();
}

interface Wheel {
    void showCircumference();
}

class CarABC implements Vehicle, Wheel {
    @Override
    public void showPerformance() {
        System.out.println("Showing Performance for CarABC implementing Vehicle Interface.");
    }

    @Override
    public void showMileage() {
        System.out.println("Showing Mileage for CarABC implementing Vehicle Interface.");
    }

    @Override
    public void showCircumference() {
        System.out.println("Showing Circumference for CarABC implementing Wheel Interface.");
    }
}

public class Main {
    public static void main(String args[]) {
        CarABC ob = new CarABC();
        ob.showPerformance();
        ob.showMileage();
        ob.showCircumference();

        System.out.println("Vehicle.build Output:"+Vehicle.build);
    }
}
