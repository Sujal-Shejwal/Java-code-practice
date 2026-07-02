 // in a program input 3 numbers A,B & C. you have to output the avg of these 3 numbers
 import java.util.Scanner;
public class file4 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter A :");
        int a = sc.nextInt();
        System.out.print("enter B :");
        int b = sc.nextInt();
        System.out.print("enter C :");
        int c = sc.nextInt();
        int sum = a + b + c / 3 ;
        System.out.println("Avg is :" + sum);
    }
}