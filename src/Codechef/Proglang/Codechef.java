package Codechef.Proglang;

import java.util.Scanner;

public class Codechef {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nutest = input.nextInt();
        int prglang[][] = new int[nutest][];
        int ok = 0;
        while (ok < nutest) {
            int temp[] = new int[6];
            for (int i = 0; i < 6; i++) {
                temp[i] = input.nextInt();
            }
            prglang[ok] = temp;
            ok++;
        }

        for (int i = 0; i < nutest; i++) {

            if (prglang[i][0] == prglang[i][2] && prglang[i][1] == prglang[i][3]) {
                System.out.println(1);

            } else if (prglang[i][0] == prglang[i][3] && prglang[i][1] == prglang[i][2]) {
                System.out.println(1);

            } else if (prglang[i][0] == prglang[i][4] && prglang[i][1] == prglang[i][5]) {
                System.out.println(2);

            } else if (prglang[i][0] == prglang[i][5] && prglang[i][1] == prglang[i][4]) {
                System.out.println(2);

            } else {
                System.out.println(0);
            }

        }
    }
}
