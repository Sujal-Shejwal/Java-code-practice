// overloading using database
// sum of 2 and sum of 3 numbers
import java.util.*;
public class fun7 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter b number: ");
        int b = sc.nextInt();
        System.out.println(sum(a, b));
        System.out.println(sum(a, b));
    }
}