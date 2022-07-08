package String.interleaving;

public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
    
        char ts1[] = s1.toCharArray();
        char ts2[] = s2.toCharArray();
        char ts3[] = s3.toCharArray();
        int s1start = 0;
        int s2start = 0;
        int count = 0;
        if (s3.length() != (s2.length() + s1.length())) {
            return false;
        }
        if (s3.isEmpty() && s2.isEmpty() && s1.isEmpty()) {
            return true;
        }
        boolean iss2running = false;
        boolean isinterleave = false;
        for (int i = 0; i < ts3.length; i++) {
            if (s1start < s1.length()) {
                if (ts3[i] == ts1[s1start] && !iss2running) {
                    isinterleave = true;
                    s1start++;
                    continue;

                }
            }

            if (s2start < s2.length()) {
                if (ts3[i] == ts2[s2start]) {
                    isinterleave = true;
                    iss2running = true;
                    s2start++;
                    continue;
                }

                else {
                    count++;
                    i--;
                    iss2running = false;
                }

            }

            if (count > 1) {
                return false;
            }
        }

        return isinterleave;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isInterleave("a", "", "aa")); 
    }
}
