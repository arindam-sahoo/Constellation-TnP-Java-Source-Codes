public class MDA {
    public static void main(String args[]) {
        // Declared and Instantiating a 2D array
        int[][] arr = new int[4][4];
        int c = 1;

        // Assigning initial values in the 2D array
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                arr[i][j] = c;
                c++;
            }
        }

        // Printing the array
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Accessed arr[1][1] and got "+arr[1][1]);
    }
}
