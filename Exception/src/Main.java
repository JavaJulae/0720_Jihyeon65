class Exception extends RuntimeException {
    public Exception (String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        // try ~ catch
        try{
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(("0으로 나눌 수 없습니다."));
        } finally {
            System.out.println("무조건 수행됩니다.\n");
        }

        // throws
        try {
            throw new Exception("강제 예외가 발생했습니다.");
        } catch (Exception e) {
            System.out.println(("Error: " + e.getMessage()));
        }
    }
}