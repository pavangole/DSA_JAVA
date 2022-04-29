package src.Array.BuyingSweets;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// User defined Pair class
class Pair {
    int x;
    int y;

    // Constructor
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// class to define user defined conparator
class Compare {

    static void compare(Pair arr[]) {
        // Comparator to sort the pair according to second element
        Arrays.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return p1.y - p2.y; // To compare the first element just
                                    // change the variable from p1.y - p2.y to x.
            }
        });

        
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();

        int[] nusweets = new int[testcases];
        int[] rs = new int[testcases];

        int[][] sweet = new int[testcases][];

        Pair arr[][] = new Pair[testcases][];
        int[][] dis = new int[testcases][];
        int i = 0;
        while (i < testcases) {

            // frist
            int n = input.nextInt(); // nu of sweets in shop
            nusweets[i] = n;
            int r = input.nextInt(); // Rupees chef has
            rs[i] = r;

            // second

            int[] temp = new int[n];
            for (int j = 0; j < n; j++) {
                temp[j] = input.nextInt();
            }
            sweet[i] = temp;

            // third
            int[] temp1 = new int[n];
            for (int j = 0; j < n; j++) {
                temp1[j] = input.nextInt();
            }
            dis[i] = temp1;
            i++;
        }

        for (int j = 0; j < dis.length; j++) {
            Pair trr[] = new Pair[dis[j].length];
            for (int j2 = 0; j2 < dis[j].length; j2++) {
                trr[j2] = new Pair(sweet[j][j2], dis[j][j2]);
            }
            arr[j] = trr;
        }

        for (int j = 0; j < testcases; j++) {
            System.out.println(new Solution().buysweets(rs[j], nusweets[j], arr[j]));
        }
        input.close();
    }

    int buysweets(int rupees, int nuofsweets, Pair[] swadesh) {

        
        Compare.compare(swadesh);

        int canbuy = 0;

        for (int i = nuofsweets - 1; i >= 0; i--) {
            while (rupees >= swadesh[i].x) {
                canbuy += 1;
                rupees = (rupees - swadesh[i].x ) + swadesh[i].y;
            }
        }

        return canbuy;
    }
}
