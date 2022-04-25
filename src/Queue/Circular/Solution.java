package src.Queue.Circular;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Solution {
    public int pancake(List<Integer> arr) {
        List<Integer> brr = arr;
        
        int served = 0;
        int previous = 0;
        int k = brr.size();
       while( k > 0) {
            int i = 0;
            int j = brr.size() - 1;
            if(brr.get(i) <= brr.get(j)) {
                if (brr.get(i) >= previous) {
                    previous = brr.remove(i);
                    served = served + 1;
                }
                else if (brr.get(j) >= previous) {
                    previous = brr.remove(j);
                    served = served + 1;
                }
            }

            else {
                if (brr.get(j) >= previous) {
                    previous = brr.remove(j);
                    served = served + 1;
                }
                else if (brr.get(i) >= previous) {
                    previous = brr.remove(i);
                    served = served + 1;
                }
            }
            k--;
            

        }

        return served;


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        List<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        int nutest = input.nextInt();
        for (int i = 0; i < nutest; i++) {
            int deli = input.nextInt();
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j < deli; j++) {
                int delitake = input.nextInt();
                temp.add(delitake);
            }
            arr.add(temp);
        }

        int i = 1;
        for (ArrayList<Integer> arrayList : arr) {
            System.out.println("Case #" + i + ": " + new Solution().pancake(arrayList));
            i++;
        }
        input.close();
    }
}
