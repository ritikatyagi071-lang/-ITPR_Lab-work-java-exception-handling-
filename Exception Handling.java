class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    static void validate(int marks) throws MyException {
        if (marks < 0 || marks > 100) {
            throw new MyException("Invalid marks entered!");
        } else {
            System.out.println("Marks are valid");
        }
    }

    public static void main(String[] args) {
        try {
            validate(150);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
