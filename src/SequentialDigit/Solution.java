package SequentialDigit;

import java.util.List;

class  Solution {

    public List sequentialDigits(int low, int high) {
        System.out.println("Low is  :- " + low);
        System.out.println("High is :- " + high);
        int count = 1;
        int num = low;
        while (num != 1) {
            num = num / 10;
            count = count * 10;
        }
        int fristdigit = num / count;
        int tmp = count;
        int number  = 0;
        while(tmp != 0) {
            number = num * tmp + number;
            tmp = tmp / 10;
        }
        System.out.println(number);
        return  null;
    }

    public static void main(String[] args) {
        new Solution().sequentialDigits(10,100);
    }
}