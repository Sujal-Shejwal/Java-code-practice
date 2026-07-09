// factorial of a number n.

import java.util.Scanner;
public class fun4 {

    // Method to calculate the factorial of a number
    public static int factorial(int n) {

        int fact = 1;

        // Multiply numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact; // Return the calculated factorial
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Read input from user

        System.out.println("Factorial = " + factorial(n));

    }
}