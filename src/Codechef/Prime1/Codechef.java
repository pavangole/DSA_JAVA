package Codechef.Prime1;

import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            for (int num = start; num <= end; num++) {
                boolean isprime = true;
                if (num == 1)
                    continue;
                for (int i = 2; i <= Math.sqrt(num) + 1; i++) {
                    if (num % i == 0) {
                        isprime = false;
                    }
                }
                if (num == 2)
                    System.out.println(2);
                if (isprime)
                    System.out.println(num);
                
            }
            System.out.println();
        }
    }

}
