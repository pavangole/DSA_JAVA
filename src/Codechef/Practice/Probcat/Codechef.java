package Codechef.Practice.Probcat;

import java.util.Scanner;

/**
 * Easy if  1≤x<100

Medium if 100 \leq x \lt 100≤x<200

Hard if 200 \leq x \leq 200≤x≤300


 */
public class Codechef {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int probn = input.nextInt();
            if (probn >= 1 && probn < 100) {
                System.out.println("Easy");
            }
            else if (probn >= 100 && probn < 200) {
                System.out.println("Medium");
            }
            else {
                System.out.println("Hard");
            }
        }
        
    }
}
