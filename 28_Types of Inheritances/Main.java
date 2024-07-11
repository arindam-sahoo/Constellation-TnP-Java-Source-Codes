// Base Class
class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double Area() {
        return width * height;
    }
}

// Derived Class | Single Inheritance - 'Square' Class is inheriting the 'Rectangle' Class
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

// Multilevel Inheritance - 'Rhombus' Class is inheriting the 'Square' Class which inherited the 'Rectangle' Class
class Rhombus extends Square {
    public Rhombus(double side) {
        super(side);
    }
}

// Hierarchial Inheritance - 'Triangle' Class inherits the 'Rectangle' Class along with the 'Square' Class
class Triangle extends Rectangle {
    public Triangle(double base, double height) {
        super(0.5*base, height);
    }
}

public class Main {
    public static void main(String args[]) {
        int height = 4, width = 6, side_s = 5, side_rh = 7, height_t = 10, base = 8;

        System.out.println("Rectangle Height:"+height);
        System.out.println("Rectangle Width:"+width);
        Rectangle r = new Rectangle(width, height);
        System.out.println("Rectangle area: "+ r.Area());

        System.out.println("Square Side:"+side_s);
        Square s = new Square(side_s);
        System.out.println("Square area: "+ s.Area());

        System.out.println("Rhombus Side:"+side_rh);
        Rhombus rh = new Rhombus(side_rh);
        System.out.println("Rhombus area: "+ rh.Area());

        System.out.println("Triangle Height:"+height_t);
        System.out.println("Triangle Base:"+base);
        Triangle t = new Triangle(base, height_t);
        System.out.println("Triangle area: "+ t.Area());
    }
}
