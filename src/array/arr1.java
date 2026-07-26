// find the largest and smallest element in an array.

import java.util.*;
public class  arr1 {
    public static int largest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int number[] = {1, 2, 6, 7, 3, 5, 4, 8, 9, 10};
        System.out.println("largest value is : " + largest(number));
    }
}