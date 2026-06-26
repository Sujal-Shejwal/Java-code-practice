// print sum of first n natural number by taking input from user



import java.util.Scanner;

public class whileloop2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What number do you have to print? ");
        int n = sc.nextInt();

        int counter = 1;

        while (counter <= n) {
            System.out.println(counter+ " ");
            counter++;
        }

        sc.close();
    }
}