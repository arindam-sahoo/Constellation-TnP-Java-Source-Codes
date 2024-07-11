import java.util.Scanner;

public class ErrorTypes {
    public static void main(String args[]) {
        // System.out.Println("Hello, We are here to talk about Java.")        // Compile Time Errors
        // Adjustments
        System.out.println("Hello, We are here to talk about Java.");
        
        // Multiplying two numbers
        // System.out.println(45+2);
        // Adjustments
        System.out.println(45*2);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = in.nextInt();
        System.out.println("Enter another number:");
        int y = in.nextInt();
        System.out.println("Dividing x by y:"+x/y);
    }
}
