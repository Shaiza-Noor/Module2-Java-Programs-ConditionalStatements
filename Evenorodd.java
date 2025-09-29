import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Ask the user for an integer
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        // Use modulo operator and if else statement to check even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
         input.close();
    }
}
