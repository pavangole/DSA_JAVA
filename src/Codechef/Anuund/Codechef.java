package Codechef.Anuund;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            int k = n;
            Collections.sort(arr);
            for (int i = 0,j= n - 1; i < n; i++,j-- ) {
                if (k == 0) {
                    break;
                }
                else if (j <= i) {
                    System.out.print(arr.get(i));
                    break;
                }
                System.out.print(arr.get(i) + " ");
                System.out.print(arr.get(j) + " ");
                k = k - 2;
                
                
                
            }
            System.out.println();
        }
    }
}
