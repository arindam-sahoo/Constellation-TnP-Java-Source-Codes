public class Main {
    public static void main(String args[]) {
        int arr[] = {0,1,3,4,5,2};
        try {
            int r = 50/arr[2];
            System.out.println(r);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("We are in the Finally Block");
        }
        System.out.println("The Program Ends Here. Have a Nice Day!");
    }
}
