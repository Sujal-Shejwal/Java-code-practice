public class bit1 {
    public static void main(String[] args) {

        // 1. Check Odd or Even
        int n = 5;

        if ((n & 1) == 1)
            System.out.println("Odd");
        else
            System.out.println("Even");


        // 2. Get ith Bit
        n = 5; // 101
        int i = 2;

        int bit = (n >> i) & 1;
        System.out.println("ith Bit: " + bit);


        // 3. Set ith Bit
        n = 4; // 100
        i = 1;

        n = n | (1 << i);
        System.out.println("After Set: " + n);


        // 4. Clear ith Bit
        n = 6; // 110
        i = 1;

        n = n & ~(1 << i);
        System.out.println("After Clear: " + n);


        // 5. Check Power of 2
        n = 8;

        if (n > 0 && (n & (n - 1)) == 0)
            System.out.println("Power of 2");
        else
            System.out.println("Not Power of 2");


        // 6. Count Set Bits
        n = 7; // 111

        System.out.println("Set Bits: " + Integer.bitCount(n));
    }
}