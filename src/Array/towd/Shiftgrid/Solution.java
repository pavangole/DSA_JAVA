package Array.towd.Shiftgrid;

import java.util.ArrayList;
import java.util.List;


public class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        while (k != 0) {
            int[] extralast = new int[grid.length];
            for (int i = 0 ; i < grid.length ; i++) {
                int tmp = -1;
                int emp = -1;
                for (int j = 0 ; j < grid[0].length -1 ; j++) {
                    if (tmp == -1) {
                        tmp = grid[i][j + 1];
                        grid[i][j + 1] = grid[i][j];
                    } else {
                        
                        emp = grid[i][j + 1];
                        grid[i][j + 1] = tmp;
                        tmp = emp;
                    }
                    
                }
                if (i == 0) {
                    grid[0][0] = grid[grid.length - 1][grid[0].length - 1];
                }
                extralast[i] = emp;

            }
            if (extralast[0] != -1) {
                for (int i = 1; i < grid.length ; i++) {
                    grid[i][0] = extralast[i - 1];
                }
            } 
            for (int a  : extralast) {

                System.out.println(a);
            }
            
            
            k--;
        }

        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < grid.length ; i++) {
            List<Integer> brr= new ArrayList<>();
            for (int j = 0; j < grid[0].length; j++) {
                
                brr.add(grid[i][j]);
            }
            arr.add(brr);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        //int[][] array = {{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}};
        
        //int[][] array = {{1},{2},{3},{4},{7},{6},{5}};
        //int[][] array = {{1,2},{4,5},{7,8}};
        System.out.println(new Solution().shiftGrid(array, 1));
    }
}
