// Print Diamond diamond

import java.util.Scanner;

public class Pat9 {
    public static void Diamond(int n){
        // first half of diamond
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Second half
        for (int i = n; i>=1; i--){
            for (int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows : ");
        int n = sc.nextInt();
        Diamond(n);
    }
}
