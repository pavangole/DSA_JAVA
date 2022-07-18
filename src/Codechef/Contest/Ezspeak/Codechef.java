package Codechef.Contest.Ezspeak;

import java.util.Scanner;

public class Codechef {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0)
    {
        int len = sc.nextInt();
        String s = sc.next();
        String vow = "aeiou";
        boolean contain = false;

        int cons = 0;
        for (int i = 0; i < len; i++) {
            if(vow.contains("" + s.charAt(i) + "")) {
                cons = 0;
            }
            else {
                cons++;
            }
            if (cons >= 4) {
                System.out.println("NO");
                contain = true;
                break;
            }
        }
        if(!contain) {
            System.out.println("YES");
        }
    }
}
