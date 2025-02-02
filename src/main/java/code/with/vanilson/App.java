package code.with.vanilson;

/**
 * Hello world!
 */
@SuppressWarnings("all")
public class App {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Hello World!");
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime);
    }

   public static boolean isUnsuportedOperation(int num) {
        try {
            return num % 0 == 0;
        } catch (ArithmeticException ex) {
            throw new ArithmeticException("Cannot divide by zero: " + num);
        }
    }
}
