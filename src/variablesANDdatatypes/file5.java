// In a program input the side of a square . You have to output the area of the square  Hint : area of a square is side * side .
import java.util.Scanner;
public class file5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side * side ;
        System.out.print("area of square : " + area);
    }
}