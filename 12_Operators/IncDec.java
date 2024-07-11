public class IncDec {
    public static void main(String args[]) {
        int a=10;
        System.err.println("Post Increment");
        System.out.println(a++);  // Post Increment
        System.out.println(a);

        int b=10;
        System.err.println("Pre Increment");
        System.out.println(++b);  // Pre Increment

        int c=10;
        System.err.println("Post Decrement");
        System.out.println(c--);  // Post Decrement
        System.out.println(c);

        int d=10;
        System.err.println("Pre Decrement");
        System.out.println(--d);  // Pre Decrement

        System.err.println("Prefix Increment using Expression");
        int p = 3;
        int res = ++p * 4;      // 16
        System.err.println(res);

        System.err.println("Prefix Decrement using Expression");
        p = 3;
        res = --p * 4;          // 8
        System.err.println(res);

        System.err.println("Postfix Increment using Expression");
        p = 3;
        res = p++ * 4;          // 12
        System.err.println(res);

        System.err.println("Postfix Decrement using Expression");
        p = 3;
        res = p-- * 4;          // 12
        System.err.println(res);
    }
}
