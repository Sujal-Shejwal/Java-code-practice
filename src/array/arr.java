/* Write a Java program to perform Linear Search on an array.
If the key is found, print its index; otherwise, print "NOT Found". */

import java.util.Scanner;

public class arr {
    public static int linearSearch(int number[], int key){
        for (int i=0; i<number.length; i++){
            if(number[i]== key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");

        int key = sc.nextInt();
        int number[]={2,4,6,8,10,12,14,16};

        int index = linearSearch(number, key);
        if (index == -1){
            System.out.println("Not Found");
        } else {
            System.out.println("Found at index " + index);
        }
    }
}