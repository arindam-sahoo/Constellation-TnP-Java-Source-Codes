class Superclass {
    void display() {
        System.out.println("The Control is in SuperClass.");
    }
}

class Subclass extends Superclass {
    
}

public class Main_v1 {
    public static void main(String args[]) {
        Subclass ob = new Subclass();
        ob.display();
    }
}
