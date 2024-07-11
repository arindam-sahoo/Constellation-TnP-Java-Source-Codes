public class ArraysSC {
    public static void main(String args[]) {
        // Declared and Initialized an array of integers
        int[] arr;
        // Instantiated the array of integers created
        arr = new int[4];
        
        // Declared and initialized arr2
        int[] arr2 = {1,9,2,8,3,7,4,6,5,10};

        // Assigning values to arr1
        arr[0] = 50;
        arr[1] = 60;
        arr[2] = 40;
        arr[3] = 70;

        System.out.println("Array1");
        for(int i=0;i<4;i++) {
            System.out.println("Index "+i+":"+arr[i]);
        }

        System.out.println("Array2");
        for(int i=0;i<10;i++) {
            System.out.println("Index "+i+":"+arr2[i]);
        }

        arr[2] = 65;
        System.out.println("Array1 after reassigning or modifying index 2");
        for(int i=0;i<4;i++) {
            System.out.println("Index "+i+":"+arr[i]);
        }

        System.out.println("Modifying each element of the arr2 by using a for loop");
        for(int i=0;i<10;i++) {
            arr2[i] = arr2[i] * 2;
            System.out.println("Index "+i+":"+arr2[i]);
        }

        System.out.println("Using Enhanced For Loop to print an array");
        for(int i:arr) {
            System.out.println(i);
        }
    }
}
