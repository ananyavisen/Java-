import java.util.Scanner;
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
class throwAndthrows {
    public static void validateMobile(String mobile) throws InvalidInputException {
        if (mobile.length() != 10) {
            throw new InvalidInputException("Mobile number must be exactly 10 digits.");
        }

        for (int i = 0; i < mobile.length(); i++) {
            char ch = mobile.charAt(i);
            if (ch < '0' || ch > '9') {
                throw new InvalidInputException("Mobile number must contain only digits.");
            }
        }
    }
    public static void validateEmail(String email) throws InvalidInputException {
        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');

        if (atIndex == -1 || dotIndex == -1 || atIndex > dotIndex) {
            throw new InvalidInputException("Invalid email format.");
        }
    }
    public static void validateUsername(String username) throws InvalidInputException {
        if (username.length() < 5) {
            throw new InvalidInputException("Username must be at least 5 characters long.");
        }
        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                throw new InvalidInputException("Username must be alphanumeric.");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Mobile Number: ");
            String mobile = sc.nextLine();
            validateMobile(mobile);

            System.out.print("Enter Email: ");
            String email = sc.nextLine();
            validateEmail(email);

            System.out.print("Enter Username: ");
            String username = sc.nextLine();
            validateUsername(username);

            System.out.println("All inputs are valid");

        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
