// reverse the given number
// n = 20043

import java.util.Scanner;
public class ForLoop3 {
    public static void main (String [] args) {
        int n = 20043;
        int rev = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n /= 10;
        }
        System.out.println(rev);
    }
}
