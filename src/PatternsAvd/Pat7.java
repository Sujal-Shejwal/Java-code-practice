// print solid rhombus


import java.util.Scanner;

public class Pat7 {
    public static void Rhombus_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = input.nextInt();
        Rhombus_pattern(n);
    }
}
