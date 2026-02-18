import java.util.Scanner;
class BankAccount {
    private int accNo;
    private String name;
    private double balance;
    BankAccount(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }
    void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        }
    }
    void displayBalance() {
        System.out.println("Account No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

 class BankApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create account
        System.out.print("Enter Account No: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(accNo, name, balance);

        int choice;

        do {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wd = sc.nextDouble();
                    acc.withdraw(wd);
                    break;

                case 3:
                    acc.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice != 4);

        sc.close();
    }
}
