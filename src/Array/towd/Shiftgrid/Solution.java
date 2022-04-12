package Array.towd.Shiftgrid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        //move k times first
        while (k-- > 0) {
            int pre = grid[grid.length - 1][grid[0].length - 1];
            for (int row = 0; row < grid.length; row++) {
                for (int col = 0; col < grid[0].length; col++) {
                    //swap with the previous element
                    int temp = grid[row][col];
                    grid[row][col] = pre;
                    pre = temp;
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int[] row : grid) {
            result.add(Arrays.stream(row).boxed().collect(Collectors.toList()));
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] array = {{1},{2},{3}};
        //int[][] array = {{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}};
        
        //int[][] array = {{1},{2},{3},{4},{7},{6},{5}};
        //int[][] array = {{1,2},{4,5},{7,8}};

        //int[][] array = {{9},{1},{2}};
        System.out.println(new Solution().shiftGrid(array, 1));
    }
}
