import java.util.Scanner;
import java.util.InputMismatchException;

class DivisionExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number (a): ");
            int a = sc.nextInt();

            System.out.print("Enter second number (b): ");
            int b = sc.nextInt();
            int result = a / b;

            System.out.println("Result of division = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integer numbers only.");
        }
        finally {
            System.out.println("Program completed. (Finally block executed)");
            sc.close();
        }
    }
}