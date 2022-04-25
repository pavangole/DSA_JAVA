package src.Array.plusone;

import java.util.ArrayList;

public class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr, int N) {

        if (arr.get(arr.size() - 1) != 9) {
            arr.set(arr.size() - 1, arr.get(arr.size() - 1) + 1);
            System.out.println(arr);
            return arr;
        }

        boolean previous = false;
        int k = 1;
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (k == 1) {
                arr.set(i, 0);
                previous = true;
                k++;
            } else {
                if (previous) {
                    if (arr.get(i) == 9) {
                        arr.set(i, 0);
                    } else {
                        arr.set(i, arr.get(i) + 1);
                        previous = false;
                    }
                }
            }

        }
        if(previous) {
            arr.add(0, 1);
        }
        System.out.println(arr);
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(9);
        arr.add(9);
        arr.add(9);
        arr.add(9);
        increment(arr, 0);
    }
}
