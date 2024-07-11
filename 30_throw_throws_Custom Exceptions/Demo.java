class IllegalAgeException extends Exception {
    @Override
    public String toString() {
        return "Age is below 18";
    }

    @Override
    public String getMessage() {
        return "Age is below 18";
    }
}

public class Demo {
    static void validateAge(int age) throws IllegalAgeException {
        if (age<18) {
            throw new IllegalAgeException();
        }
        System.out.println(age+" is a valid age.");
    }

    public static void main(String args[]) {
        int age = 34;
        try {
            validateAge(age);
        }
        catch (IllegalAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
