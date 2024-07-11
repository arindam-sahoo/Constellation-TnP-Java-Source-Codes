import java.util.Scanner;

public class textData {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Literal Assignment
        // System.out.print("Enter a String : ");
        // String s1 = in.nextLine();
        // System.out.println("String created using Literal Assignment: " + s1);

        // // 'new' keyword
        // String s2 = new String("Java");
        // System.out.println("Created using 'new' keyword: " + s2);

        // Array of Characters
        // char[] s = {'P', 'r', 'o', 'g', 'r', 'a', 'm'};
        // String s3 = new String(s);
        // System.out.println("Created using Array of Characters: " + s1);
        // System.out.println("Length of '"+s1+"' is "+s1.length());

        // System.out.print("Enter an integer : ");
        // int n = in.nextInt();
        // System.out.println("At index "+n+" of '"+s1+"' we have the character "+s1.charAt(n));
        
        // System.out.print("Enter a character : ");
        // char ch = in.next().charAt(0);
        // System.out.println("Character "+ch+" is at index "+s1.indexOf(ch)+" of '"+s1+"'");
        // System.out.println("Character "+ch+" is at index "+s1.lastIndexOf(ch)+" of '"+s1+"' for the last time");

        String s1 = "Programming";
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(3, 8));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.replace('P', 'L'));

        System.out.println("Java".concat("Program"));
        System.out.println("Java".concat(" Program"));
        System.out.println("Java"+" Program");

        String x = "Java";
        String y = "Program";
        String z = "java";
        System.out.println(x.equals(y));
        System.out.println(x.equalsIgnoreCase(z));

        System.out.println(x.compareTo(y));
        System.out.println(x.compareToIgnoreCase(z));
    }
}
