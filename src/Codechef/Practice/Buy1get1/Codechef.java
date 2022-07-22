package Codechef.Practice.Buy1get1;

import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            int cost = 0;
            int count = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if(s.charAt(i) == s.charAt(i + 1) && count != 2) {
                    cost++;
                    count++;
                }
                else {
                    cost = cost + 1;
                    count = 0;
                }
            }
            System.out.println(cost);
        }
    }
}
