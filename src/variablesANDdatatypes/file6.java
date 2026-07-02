// Enter cost of 3 items from the user (using floa data type) , a pencil , a pen and an eraser . You have to output the total cost of  the items back to the user as their bill
// Add on : you can also try adding 18% gst tax to the items in the bill as an advanced problem.
import java.util.Scanner;
public class file6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cost of Pencil : " );
        float pencil = sc.nextFloat();
        System.out.print("Cost of Pen : " );
        float pen = sc.nextFloat();
        System.out.print("Cost of Eraser : " );
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("Bill is : " + total);

        // add on gst with 18% tax
        float newTotal = total+(0.18f*total);
        System.out.println("Bill with 18% Tax is : " + newTotal);
    }
}