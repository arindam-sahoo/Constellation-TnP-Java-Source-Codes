public class DeadlockEg {
    static class Friend {
        private final String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public synchronized void gift(Friend abc) {
            System.out.println(this.name+" gifted "+abc.getName());
            abc.returnGift(this);
        }

        public synchronized void returnGift(Friend abc) {
            System.out.println(this.name+" return gifted "+abc.getName());
        }
    }

    public static void main(String args[]) {
        final Friend a = new Friend("Java");
        final Friend b = new Friend("Python");

        new Thread(new Runnable() {
            public void run() {
                a.gift(b);
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                b.gift(a);
            }
        }).start();
    }
}
