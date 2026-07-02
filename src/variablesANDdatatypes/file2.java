// product of a and b.

import java.util.Scanner;
public class file2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int a = sc.nextInt();
        System.out.print("enter Second number : ");
        int b = sc.nextInt();
        int product = a * b;
        System.out.println("Total is : " + product);
    }

}