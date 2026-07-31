// WAP to find the maximum subarray sum using the brute force approach.

public class arr7 {
    public static void MaxsubarraysSum(int numbers [] ){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i=0; i < numbers.length; i++) {
            int start = i;
            for (int j=i; j<numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k=start; k<= end; k++) {
                    currSum+= numbers[k];
                }
                System.out.println(currSum);
                if (currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("maximum Sumarray sum ="+maxSum);
    }
    public static void main (String [] args){
        int numbers[] = {2,0,0,4,3,7};
        MaxsubarraysSum(numbers);
    }
}
