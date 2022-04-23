package src.String.ValidPar;

import java.util.Stack;



public class Solution {
    public boolean isValid(String s) {
        char[] str = s.toCharArray();
        boolean isValid = false;

        Stack<Character> valid = new Stack<Character>();
        if (s.isEmpty()) {
            return false;
        }
        valid.push(str[0]);
        for (int i = 1; i < str.length; i++) {
        
        }
        return isValid;


    }

    public static void main(String[] args) {
       System.out.println( new Solution().isValid("()"));
    }
}


