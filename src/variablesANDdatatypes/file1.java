// sum of a and b input from user.
import java.util.Scanner;
public class file1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int a = sc.nextInt();
        System.out.print("enter Second number : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Total is : " + sum);
    }

}