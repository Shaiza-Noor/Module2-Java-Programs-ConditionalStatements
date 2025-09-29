import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for two numbers
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
          System.out.print("Enter second number: ");
         double num2 = input.nextDouble();
        // Ask for desired operation
        System.out.print("Enter operation (+, -, *, /): ");
        char operation = input.next().charAt(0);

        double result;

        // Perform calculation based on operation
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero!");
                input.close();
                return;
            }
        } else {
            System.out.println("Invalid operation!");
            input.close();
            return;
        }

      

        

        System.out.println("Result: " + result);

        input.close();
    }
}
