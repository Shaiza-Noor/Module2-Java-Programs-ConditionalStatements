import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a traffic light color
        System.out.print("Enter traffic light color (red, yellow, green): ");
        String color = sc.next();

        // Display corresponding action based on input
        if (color.equals("red")) {
            System.out.println("Stop");
        } else if (color.equals("yellow")) {
            System.out.println("Slow Down");
        } else if (color.equals("green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid color. Please enter red, yellow, or green.");
        }

        sc.close();
    }
}
