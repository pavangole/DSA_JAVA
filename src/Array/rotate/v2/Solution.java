package src.Array.rotate.v2;

public class Solution {
    public void rotateArr(int arr[], int d, int n)
    {
        int[] temparr = new int[d];
        for (int i = 0; i < temparr.length; i++) {
            temparr[i] = arr[i];
            arr[i] = -1;
        }
        for (int i = 0; i < temparr.length; i++) {
            System.out.println(temparr[i]);
        }

        int k = d;
        while ( k-- > 0) {
            for (int i = 0; i < arr.length -1; i++) {
                arr[i] = arr[i + 1];
            }
        }

        int start = n - d;
        for (int i = start ,j = 0 ; i < arr.length;i++,j++) {
            arr[i]  = temparr[j];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {25,6,20,55,69,5,50,63,61,41,87,80,2,96,77,70,12,43,31,8,64,41,68,18,95,79,52,74,1,98,3,26,3,74,32,23,79,81,37,39,21,24,18,22,71,47,44};
        System.out.println(arr.length);
        new Solution().rotateArr(arr, 77, arr.length);
    }
}
