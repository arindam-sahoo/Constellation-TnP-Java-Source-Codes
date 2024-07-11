class Superclass {
    void display() {
        System.out.println("The Control is in SuperClass.");
    }
}

class Subclass extends Superclass {
    @Override
    void display() {
        System.out.println("The Control is in SubClass.");
    }
}

public class Main_v2 {
    public static void main(String args[]) {
        Subclass ob = new Subclass();
        ob.display();
    }
}
