package Codechef.sortedn;

import java.util.Scanner;

public class Codechef {

    static void nsorted(int arr[],int fpos, int lpos , int len) {
        int frist = 1;
        int last = len;
        int count = 0;
        while (arr[0] != frist || arr[len - 1] != last) {
            if (arr[0] != frist && fpos != 0) {
                int temp = arr[fpos - 1];
                if (temp == len) {
                    lpos++;
                }
                arr[fpos - 1] = arr[fpos];
                arr[fpos] = temp;
                count++;
                fpos--;
            }
            if (arr[len - 1] != last && lpos != len - 1) {
                int temp = arr[lpos + 1];
                if (temp == 1) {
                    fpos--;
                }
                arr[lpos + 1] = arr[lpos];
                arr[lpos] = temp;
                count++;
                lpos++;
            }
        }
        System.out.println(count);
    }
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nutest = input.nextInt();
        int arr[][] = new int[nutest][];
        int pos[][] = new int[nutest][];

        for (int i = 0; i < nutest; i++) {
            int len = input.nextInt();
            int brr[] = new int[len];
            int postemp[] = new int[2];
            for (int j = 0 ; j < len ; j++) {
                brr[j] = input.nextInt();
                if (brr[j] == 1) {
                    postemp[0] = j;
                }
                if (brr[j] == len) {
                    postemp[1] = j;
                }
            }
            pos[i] = postemp;
            arr[i] = brr;
        }

        for (int i = 0 ; i < nutest ; i++) {
            nsorted(arr[i], pos[i][0], pos[i][1],arr[i].length);
        }




        // for (int i = 0; i < arr.length ; i++) {
        //     int frist = 1;
        //     int last =  arr[i].length;
        //     int countswap = 0;
        //     while (arr[i][0] != frist || arr[i][arr[i].length - 1] != last) {
        //         for (int j = 0 ; j < arr[i].length - 1; j++) {
        //             if (arr[i][0] == frist && arr[i][arr[i].length - 1] == last) {
        //                 break;
        //             }
        //             int temp = arr[i][j + 1];
        //             arr[i][j + 1] = arr[i][j];
        //             arr[i][j] = temp;
        //             countswap++;

        //         }
        //     }
        //     System.out.println(countswap);
        // }


        // for (int j = 0 ; j < arr[i].length; j++) {
        //     System.out.println(arr[i][j]);
        // }
    }
}
