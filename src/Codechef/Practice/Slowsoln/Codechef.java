package Codechef.Practice.Slowsoln;

import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) {
            int time = 0;
            int maxt = sc.nextInt();
            int maxn = sc.nextInt();
            int sumn = sc.nextInt();
            for (int i = 1; i <= maxt; i++) {
                int temptime = 0;
                int k = i;
                int j = sumn;
                while (k-- > 0 && j!= 0) {
                    if (j < maxn) {
                        maxn=j;
                    }
                    temptime = temptime + (maxn * maxn);
                    j = j - maxn;
                }
                if (temptime > time ) {
                    time = temptime;
                }
            }
            System.out.println(time);
        }
    }
}
