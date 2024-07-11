public class TypeCasting {
    public static void main(String args[]) {
        // String a = "123", b = "4";
        // System.out.println(Integer.parseInt(a)+Integer.parseInt(b));

        // Implicit Type Casting
        int myInt = 9;
        double myDouble = myInt;
        float myFloat = myInt;
        long myLong = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myLong);

        // Explicit Type Casting
        double yourDouble = 8.78;
        System.out.println((float)yourDouble);
    }
}
