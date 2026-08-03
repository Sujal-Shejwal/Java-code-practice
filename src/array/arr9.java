// WAP to find the maximum subarray sum using the kadanes Algorithm.

public class arr9 {
    public static void kadanes (int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs =0;
        for (int i=0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if ( cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms,cs);
        }
        System.out.println("Maximum Subarray Sum = "+ms);
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
}
