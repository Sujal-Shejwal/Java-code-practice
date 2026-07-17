// write a method named isEven that accepts an int argument. The method should return true if the argument is even or false otherwise. Also write a program to test your method.

import java.util.*;
public class fun13 {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(isEven(num));
        sc.close();
    }
}