import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the number for which they want the multiplication table
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Display the multiplication table for the number
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // Close the scanner object
        scanner.close();
    }
}

