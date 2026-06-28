// check if a number is prime or not prime number.

import java.util.Scanner;
public class vimp {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        boolean isPrime = true ;
        if (n <= 1) {
            isPrime = false ;
        }
        for (int i =2; i< n ; i++) {
            if (n%i==0) {
                isPrime = false ;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime Number");
        }  else {
            System.out.println("Not Prime Number");
        }
    }
}