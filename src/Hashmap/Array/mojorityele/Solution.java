package src.Hashmap.Array.mojorityele;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    int majorityElement(int a[], int size) {

        Map<Integer, Integer> majorstore = new HashMap<Integer, Integer>();
        int res = size / 2;
        for (int i = 0; i < a.length; i++) {
            if (majorstore.containsKey(a[i])) {
                majorstore.put(a[i], majorstore.get(a[i]) + 1);
            } else {
                majorstore.put(a[i],1);
            }

        }

        for (Map.Entry<Integer,Integer> item: majorstore.entrySet()) {
            int key = (Integer)item.getKey();
            int value = (Integer) item.getValue();

            if (value > res) {
                return key;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] a = {3,1,3,3,2};
        System.out.println(new Solution().majorityElement(a, a.length));
        
    }
}
