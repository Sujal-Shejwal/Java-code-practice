// Sum of first N natural numbers.

import java.util.Scanner;
public class whileloop3 {
    public static void main (String [] lund ) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int i = 1 ;
        int sum = 0;
        while (i <= n) {
            sum += i ;
            i++;
        }
        System.out.println("sum is :" + sum );
    }

}