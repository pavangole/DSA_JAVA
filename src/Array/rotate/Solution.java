package src.Array.rotate;

public class Solution {
    void rotateArr(int arr[], int d, int n) {
        if (arr.length == 0) {
            return;
        }

        if (arr.length >= 3) {
            {
                while (d-- > 0) {
                    int end = arr[arr.length - 1];
                    int temp = arr[0];
                    for (int i = 0; i < arr.length - 2; i++) {
                        if (i == 0) {
                            arr[i] = end;
                        }
                        int emp = arr[i + 1];
                        arr[i + 1] = temp;
                        temp = emp;

                    }
                    arr[arr.length - 1] = temp;

                }
            }

        } else {
            while (d-- > 0) {
                int temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;

            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        int d = 1;
        int n = 1;
        new Solution().rotateArr(arr, d, n);
    }

}
