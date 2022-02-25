package Hashmap.String.UniqueCharacter;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int firstUniqChar(String s) {
        Queue<Integer>  queue = new PriorityQueue<>();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)))
                map.replace(s.charAt(i),map.get(s.charAt(i)) + 1);
            else {
                map.put(s.charAt(i), 1);
                queue.add(i);
            }
        }
        int size = queue.size();
        try {
            for (int i = 0; i < size; i++) {
                int pos = queue.poll();

                if (map.get(s.charAt(pos)) == 1) {
                    return pos;
                }
            }
        } catch (Exception e) {
            return -1;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().firstUniqChar("dddccdbba"));
    }
}
