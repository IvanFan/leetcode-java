package LeetCodeArray.EasyQuestions;

/**
 * Created by yifanfan on 25/2/18.
 */
public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {

        if ((nums.length * nums[0].length) != (r * c)) {
            return nums;
        }
        int[][] newArray = new int[r][c];
        int currentTempNumber = 0;
        for (int rowIndex =0; rowIndex < nums.length; rowIndex ++ ) {
            for (int columnIndex = 0; columnIndex < nums[0].length; columnIndex ++){
                newArray[currentTempNumber/c][currentTempNumber%c] = nums[rowIndex][columnIndex];
                currentTempNumber++;
            }
        }
        return newArray;
    }
}
