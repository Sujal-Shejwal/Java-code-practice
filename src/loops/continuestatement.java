// Skip number 3 using continue statement

import java.util.Scanner;
public class continuestatement {
    public static void main (String [] args) {
       for ( int i = 1 ; i<= 5; i++) {
           if (i == 3) {
               continue;
           }
           System.out.println(i);
        }
    }
}