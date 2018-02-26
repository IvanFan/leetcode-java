package LeetCodeArray.EasyQuestions;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by yifanfan on 26/2/18.
 */
public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int r=0; r < grid.length; r++) {
            for (int c=0; c < grid[r].length; c++) {
                int[][] temGrid = grid;
                int cur = this.getMaxLength(r,c,temGrid);
                max = cur>max? cur:max;
            }
        }
        return max;
    }

    public int getMaxLength(int r, int c, int[][] grid) {
        if (grid[r][c] != 1 ) {
            return 0;
        }
        grid[r][c] = 0;
        // get top
        int top = r>0?this.getMaxLength(r-1,c,grid):0;
        int left = c>0?this.getMaxLength(r,c-1,grid):0;
        int right = c+1<grid[r].length?this.getMaxLength(r,c+1,grid):0;
        int bottom = r+1<grid.length?this.getMaxLength(r+1,c,grid):0;
        return 1+top+left+right+bottom;
    }
    // another solution is to use class level attribute to hold a seen list
}
