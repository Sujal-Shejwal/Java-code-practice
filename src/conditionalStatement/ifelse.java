// Write a Java program to get a number from the user and print whether  it is positive or negative.
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        if (x>0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}