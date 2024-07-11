public class NestedIf {
    public static void main(String args[]) {
        int num = 6;
        // if (num > 0) {
        //     if (num % 2 == 0) {
        //         System.out.println(num + " is a POSITIVE number as well as an EVEN number.");
        //     }
        // }

        // if ((num > 0) && (num % 2 == 0)) {
        //     System.out.println(num + " is a POSITIVE number as well as an EVEN number.");
        // }

        if ((num > 0) || (num % 2 == 0)) {
            System.out.println(num);
        }
    }
}
