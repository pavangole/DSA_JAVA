package src.String.strstr;

public class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.length() > haystack.length()) {
            return -1;
        }

        char[] hay = haystack.toCharArray();
        if(needle.isEmpty()) {
            return 0;
        
        }

        
        
        boolean isThere = false;
        

        char[] nee = needle.toCharArray();

        
        for (int i = 0; i < haystack.length() ; i++) {
            if (hay[i] == nee[0]) {
                isThere = true;
                for (int j = 1; j < nee.length; j++) {
                    if ( j + i  >= haystack.length()) {
                        return -1;
                    }
                    if (nee[j] == hay[j + i]) {
                        isThere = true;
                    }

                    else {
                        isThere = false;
                        break;
                    }
                }

                if (isThere) {
                    return i;
                }
            }

        }
        

        return -1;
    }

    public static void main(String[] args) {
        

        String haystack = "a", needle = "a";
        System.out.println(new Solution().strStr(haystack, needle));
    }
}
