package src.String.reversestringII;

import javax.lang.model.util.Elements.Origin;

public class Solution {
    
    public String reverseStr(String s, int k) {
        char[] orignal = s.toCharArray();
        char[] result = new char[s.length()];
        int tok = k * 2 - 1;
        
        k = k -1;
        
        for (int i = 0; i < s.length() ;) {
            int h = i;
            int t = k + i;
            while ( h !=  t && h < t ) {
                char temp = orignal[h];
                orignal[h] = orignal[t];
                orignal[t] = temp;
                h++;
                t--;

            }
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
