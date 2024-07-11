public class LogOper {
    public static void main(String args[]) {
        System.err.println("AND Operations");
        System.err.println(true && true);
        System.err.println(true && false);
        System.err.println(false && true);
        System.err.println(false && false);

        System.err.println("OR Operations");
        System.err.println(true || true);
        System.err.println(true || false);
        System.err.println(false || true);
        System.err.println(false || false);

        System.err.println("NOT Operations");
        System.err.println(!true);
        System.err.println(!false);
    }
}
