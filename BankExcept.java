import java.util.Scanner;

class NegativeAmountException extends Exception {
    NegativeAmountException(String message) {
        super(message);
    }
}

 class BankExcept {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter amount: ");
            int amount = sc.nextInt();

            if (amount < 0) {
                throw new NegativeAmountException("Amount cannot be negative!");
            }

            System.out.println("Valid amount entered: " + amount);
        }

        catch (NegativeAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        catch (Exception e) {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}
