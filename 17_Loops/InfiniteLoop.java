public class InfiniteLoop {
    public static void main(String args[]) {
        int i = 0;
        while(true){
            System.out.println(i);
            i++;
            if (i==200) break;
        }
    }
}
