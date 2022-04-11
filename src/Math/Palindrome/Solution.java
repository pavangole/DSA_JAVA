package Math.Palindrome;

public class Solution {
    boolean isPalindrome(int x) {
        int number = 0;
        int store = x;
        while (x > 0) {
            int unit = x % 10;
            number = unit + number * 10;
            x = x / 10;
        }

        if (number == store) {
            return true;
        }

        return false;
        
    }
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(121));
    }

}
