import java.io.Console;

public class HiddenPass {
    public static void main(String[] args) {

        Console con = System.console();
        if (con == null) {
            System.out.println("Console not available. Run from terminal.");
            return;
        }
        String username = con.readLine("Enter Username: ");
        char[] passwordArray = con.readPassword("Enter Password: ");
        String password = new String(passwordArray);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}

