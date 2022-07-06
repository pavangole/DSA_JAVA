package String.lenoflongestsubstring;

import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {

        int maxlenght = 0;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        char[] j = s.toCharArray();
        for (int p = 0; p < j.length; p++) {

            for (int i = p; i < j.length; i++) {
                if (map.containsKey(j[i])) {
                    System.out.println(map);
                    int temp = map.size();
                    if (temp >= maxlenght) {
                        
                        maxlenght = temp;
                        
                    }
                    map.clear();
                    break;
                } else {
                    map.put(j[i], 1);
                }
            }
            if (map.size() >= maxlenght) {
                maxlenght = map.size();
            }
            
        }
        System.out.println(maxlenght);
        
        return maxlenght;
    }

    public static void main(String[] args) {
        new Solution().lengthOfLongestSubstring("qrsvbspk");
    }
}
