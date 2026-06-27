// print reverse of a number

import java.util.Scanner;
public class ForLoop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 20043;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit + " ");
            n = n / 10;
        }
        System.out.println();
    }
}