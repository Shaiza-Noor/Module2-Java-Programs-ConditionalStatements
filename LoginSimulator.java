import java.util.Scanner;
public class LoginSimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input username and password
        System.out.print("Enter username: ");
        String user = input.next();
        System.out.print("Enter password: ");
        String pass = input.next();
        // Check credentials
        if (user.equals("admin") && pass.equals("admin123")) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Credentials. Please try again.");
        }

        input.close();
    }
}
