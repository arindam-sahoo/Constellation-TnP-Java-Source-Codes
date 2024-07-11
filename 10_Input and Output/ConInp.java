import java.util.Scanner;

public class ConInp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name : ");
        // int x = sc.nextInt();
        String x = sc.nextLine();
        // char x = sc.next().charAt(0);
        System.out.println("Hello! "+x);
    }
}
