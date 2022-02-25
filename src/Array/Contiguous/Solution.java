package Array.Contiguous;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    Map<String, Integer> map = new HashMap<>();
    public int findMaxLength(int[] nums) {

        if (nums == null) {
            return  0;
        }

        map.put("zero",0);
        map.put("one",0);
        int maxlenght = 0;
        int len = nums.length;
        for (int i = 0; i < len ; i++) {
            if (nums[i] == 0) {
               map.put("zero",map.get("zero") + 1);
            }
            else {
                map.put("one",map.get("one") + 1);
            }
            if (map.get("zero") == map.get("one")) {
                int tmp = map.get("zero") + map.get("one");
                if (tmp  > maxlenght) {
                    maxlenght = tmp;
                }
            }

        }

        if (map.get("zero ") > map.get("one")) {
            int diff = map.get("zero") - map.get("one");
            if (map.get("zero") - diff == map.get("one") ) {
                if (2 * map.get("one") > maxlenght)
                    maxlenght = 2 * map.get("one");
            }
        }
        else if (map.get("zero") == map.get("one")) {
            maxlenght = 2 * map.get("one");
        }
        else {
            int diff = map.get("one") - map.get("zero");
            if (map.get("one") - diff == map.get("zero") ) {
                if (2 * map.get("zero") > maxlenght)
                    maxlenght = 2 * map.get("zero");
            }
        }

        return  maxlenght;

    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,0,0,0,0,1,1,0,1,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,0,0,0,1,0,1,0,0,0,1,1,0,0,0,0,1,0,0,1,1,1,1,1,0,0,1,0,1,1,0,0,0,1,0,0,0,1,1,1,0,1,1,0,1,0,0,1,1,0,1,0,0,1,1,1,0,0,1,0,1,1,1,0,0,1,0,1,1};
        System.out.println(new Solution().findMaxLength(nums));
    }
}
