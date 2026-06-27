// print sum of first n natural number by taking input from user
import java.util.Scanner;
public class whileloop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i+ " ");
            i++;
        }
        sc.close();
    }
}