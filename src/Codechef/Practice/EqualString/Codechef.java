package Codechef.Practice.EqualString;

import java.util.ArrayList;
import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            ArrayList<Character> check = new ArrayList<Character>();
            int count = 0;
            for (int i = 0; i < n; i++) {
                if(a.charAt(i) != b.charAt(i)) {
                    if(!check.contains(b.charAt(i))) {
                        count++;
                        check.add(b.charAt(i));
                    }
                }
              
            }
            System.out.println(count);
        }
    }
}
