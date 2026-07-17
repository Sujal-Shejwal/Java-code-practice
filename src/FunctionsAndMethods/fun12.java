// WAP in java methor to compute the avg of three numbers

import java.util.Scanner;

public class fun12 {

    public static int avg(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int average = avg(num1, num2, num3);

        System.out.println("Average = " + average);

        sc.close();
    }
}
