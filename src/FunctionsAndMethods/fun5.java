// find binomial coefficient

import java.util.Scanner;

public class fun5 {

    // Method to calculate factorial
    public static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    // Method to calculate Binomial Coefficient
    public static int binCoeff(int n, int r) {

        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        return fact_n / (fact_r * fact_nmr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        // Correct method call
        System.out.println("Binomial Coefficient = " + binCoeff(n, r));

        sc.close();
    }
}