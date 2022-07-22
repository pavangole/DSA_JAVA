package Codechef.Makepala2;

import java.util.HashMap;
import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) {
            int n = sc.nextInt();
            
            StringBuilder s = new StringBuilder(sc.next());
            if(s.toString().matches(s.reverse().toString())) {
                System.out.println(s);
            }
            else {
                s.deleteCharAt(1);
                System.out.println(s);
            }
        }
    }
}

