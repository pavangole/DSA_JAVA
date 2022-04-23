package src.Array.Missing;

public class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int allsum = (len * (len + 1)) / 2;
        int sum = 0;
        for (int index = 0; index < nums.length; index++) {
            sum = sum + nums[index];
        }

        int missing = allsum - sum;
        return missing;
    }
}
