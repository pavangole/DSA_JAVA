package Codechef.Error;

import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            String fb = sc.next();
            if(fb.contains("010") || fb.contains("101")) {
                System.out.println("Good");
            }
            else {
                System.out.println("Bad");
            }
        }
        sc.close();
    }
}
