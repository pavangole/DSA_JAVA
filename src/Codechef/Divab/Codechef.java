package Codechef.Divab;

import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            if(a == b || b == 1) {
                System.out.println(-1);
            }
            else if (n % a == 0 && n % b != 0) {
                System.out.println(n);
            }
            else {
                int starta = (n / a) + 1 ;
                n = starta * a;
                while(n % b == 0 || n % b!= 0) {
                    if(n % a == 0 && n % b != 0) {
                        System.out.println(n);
                        break;
                    }
                    n = n + a;
                }
            }
        }
    }
}
