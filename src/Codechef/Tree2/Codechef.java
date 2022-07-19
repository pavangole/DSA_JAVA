package Codechef.Tree2;

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
            Collections.max(arr);
            Collections.min(arr);
        }
    }
}
