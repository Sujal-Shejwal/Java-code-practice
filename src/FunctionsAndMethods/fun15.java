// WAP to compute the sum of the digits in an integer.

import java.util.Scanner;
public class fun15 {
    // Method to calculate the sum of digits
    public static int sumofDigit(int num) {
        int sum = 0;
        for (; num > 0; num /= 10) {
            sum += num % 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        System.out.println("Sum of digits = " + sumofDigit(sc.nextInt()));
        sc.close();
    }
}