// leetcode problem no 217
/*  Given an integer array nums, determine whether the array contains any duplicate elements.
Return true if any value appears at least twice in the array; otherwise, return false if all elements are distinct. */

import java.util.HashSet;
public class arr12 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        arr12 obj = new arr12();
        boolean ans = obj.containsDuplicate(nums);
        System.out.println(ans);
    }
}