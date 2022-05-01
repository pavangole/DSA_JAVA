package src.String.reversestringII;

import javax.lang.model.util.Elements.Origin;

public class Solution {
    
    public String reverseStr(String s, int k) {
        char[] orignal = s.toCharArray();
        char[] result = new char[s.length()];
        
        for (int i = 0; i < s.length() ;) {
            int h = i;
            int t = Math.min(i + k - 1,s.length() -1 );
            while (  h < t ) {
                char temp = orignal[h];
                orignal[h] = orignal[t];
                orignal[t] = temp;
                h++;
                t--;

            }
            i += 2 * k;
        }
        
        
        String result2 = "";
        for (int i = 0; i < orignal.length; i++) {
            result2 = result2 + orignal[i];
        }

        return result2;
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 3;
       System.out.println( new Solution().reverseStr(s, k));
    }
}
