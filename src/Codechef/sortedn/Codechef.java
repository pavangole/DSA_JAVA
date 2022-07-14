package Codechef.sortedn;

import java.util.Scanner;

public class Codechef {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nutest = input.nextInt();
        int arr[][] = new int[nutest][];

        for (int i = 0; i < nutest; i++) {
            int len = input.nextInt();
            int brr[] = new int[len];
            for (int j = 0 ; j < len ; j++) {
                brr[j] = input.nextInt();
            }

            arr[i] = brr;
        }






        for (int i = 0; i < arr.length ; i++) {
            int frist = 1;
            int last =  arr[i].length;
            int countswap = 0;
            while (arr[i][0] != frist || arr[i][arr[i].length - 1] != last) {
                for (int j = 0 ; j < arr[i].length - 1; j++) {
                    if (arr[i][0] == frist && arr[i][arr[i].length - 1] == last) {
                        break;
                    }
                    int temp = arr[i][j + 1];
                    arr[i][j + 1] = arr[i][j];
                    arr[i][j] = temp;
                    countswap++;

                }
            }
            System.out.println(countswap);
        }


        // for (int j = 0 ; j < arr[i].length; j++) {
        //     System.out.println(arr[i][j]);
        // }
    }
}
