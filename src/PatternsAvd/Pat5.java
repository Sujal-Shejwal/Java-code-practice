// print 0-1 triangle

import java.util.Scanner;

public class Pat5 {
    public static void zero_one_triangle(int n){
        for (int i= 1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if ( ( i + j) % 2 == 0){
                  System.out.print(1);
                } else {
                  System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter a number :" );
        int n = input.nextInt();
        zero_one_triangle(5);
    }
}
