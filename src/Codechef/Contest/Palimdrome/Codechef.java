package Codechef.Contest.Palimdrome;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codechef {

   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int len = sc.nextInt();
            String tocheck = sc.next();
            ArrayList<Character> even = new ArrayList<Character>();
            ArrayList<Character> odd = new ArrayList<Character>();

            for (int i = 0; i < len - 1; i++) {
                if((i + 1) % 2 == 0) {
                    even.add(tocheck.charAt(i));
                }
                else {
                    odd.add(tocheck.charAt(i));
                }
            }
            even.add(tocheck.charAt(len - 1));
            Collections.sort(odd);
            Collections.sort(even);
            if(odd.equals(even)) {
                System.out.println("YES");
            }
            else {
                System.out.println("No");
            }

            
        }
    }
}
