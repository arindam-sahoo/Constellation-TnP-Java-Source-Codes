class Superclass {
    void display() {
        System.out.println("The Control is in SuperClass.");
    }
}

class Subclass extends Superclass {
    @Override
    void display() {
        super.display();
        System.out.println("The Control is in SubClass.");
    }
}

public class Main_v3 {
    public static void main(String args[]) {
        Subclass ob = new Subclass();
        ob.display();
    }
}
