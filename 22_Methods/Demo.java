class MyObj {
    int value;
}

public class Demo {

    // Static Method Declaration
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Final Method Declaration
    public final void finalMethod() {
        System.out.println("This is a final method.");
    }

    // Declaring a Method
    public void display() {
        System.out.println("Display method with no parameters.");
    }

    // Method with Parameters
    // Method Overloading
    public void display(String message) {
        System.out.println("Display method with one parameter: " + message);
    }

    // Method Called By Reference
    static void changeRefValue(MyObj obj) {
        obj.value = 10;
        System.out.println("Value of val inside the method is "+obj.value);
    }

    // Method Called By Value
    void changeValue(int num) {
        num = 10;
        System.out.println("Value of num inside the method is "+num);
    }

    // Recursive Method
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Main Method for Method Invocation
    public static void main(String[] args) {
        // Creating an object to call non-static methods
        Demo ob = new Demo();

        // Invoking a method
        ob.display();

        // Call By Value
        int num = 5;
        System.out.println("Value of num before invocating the method is "+num);
        ob.changeValue(num);
        System.out.println("Value of num outside the method is "+num);

        // Call by Reference
        MyObj obj = new MyObj();
        obj.value = 5;
        System.out.println("Value of val before invocating the method is "+obj.value);
        changeRefValue(obj);
        System.out.println("Value of val outside the method is "+obj.value);

        // Invoking static method
        staticMethod();

        // Invoking final method
        ob.finalMethod();

        // Invoking overloaded methods
        ob.display();
        ob.display("Hello, I am Java!");

        // Invoking recursive method to calculate factorial
        int number = 5;
        int result = ob.factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }
}

// class DemoChild extends Demo {
//     public void finalMethod() {
//         // A final method can not be overriden by subclasses
//         System.out.println("Trying to Override the final method in Sub-Class.");
//     }
// }