public class bit2 {
    public static void main(String[] args) {
        int n = 5;
        if ((n & 1) == 1)
            System.out.println("Odd");
        else
            System.out.println("Even");
        n = 5;
        int i = 2;
        int bit = (n >> i) & 1;
        System.out.println("ith Bit: " + bit);
        n = 4;
        i = 1;
        n = n | (1 << i);
        System.out.println("After Set: " + n);
        n = 6;
        i = 1;
        n = n & ~(1 << i);
        System.out.println("After Clear: " + n);
        n = 8;
        if (n > 0 && (n & (n - 1)) == 0)
            System.out.println("Power of 2");
        else
            System.out.println("Not Power of 2");
        n = 7;
        System.out.println("Set Bits: " + Integer.bitCount(n));
    }
}