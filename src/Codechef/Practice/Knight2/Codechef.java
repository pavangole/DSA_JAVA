package Codechef.Practice.Knight2;

import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0 ) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            if ((x1 + y1 ) % 2 == 0 && (x2 + y2) % 2 == 0) {
                System.out.println("YES");
            }
            else if ((x1 + y1) % 2 != 0 && ((x2 + y2 ) % 2 != 0)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
