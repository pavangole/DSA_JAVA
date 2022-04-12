package String.lengthoflast;

public class Solution {
    public int lengthOfLastWord(String s) {

        String[] a = s.split(" ");

        return a[a.length -1 ].length();



    }

    public static void main(String[] args) {
        new Solution().lengthOfLastWord("luffy is still joyboy");
    }
}