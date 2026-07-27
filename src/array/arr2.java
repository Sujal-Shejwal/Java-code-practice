// WAP to perform binary search on a sorted array . If the key is found return its index otherwise return -1.
import java.util.*;

public class arr2 {
    public static int binarySearch(int number[], int key){
        int start = 0 , end = number.length - 1;
        while(start<=end){
            int mid = (start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            if (number[mid]<key){
                    start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key to search:");
        int key = sc.nextInt();
        int number[] = {2,4,6,8,10,12,14};
        System.out.println("Index for key is : "+binarySearch(number,key));
    }
}
