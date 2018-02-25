package LeetCodeArray.EasyQuestions;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yifanfan on 24/2/18.
 */
public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int rowIndex = 1;
             rowIndex < matrix.length;
             rowIndex ++) {
            for (int columnIndex = 1;
                 columnIndex < matrix[rowIndex].length;
                 columnIndex ++){
                if (matrix[rowIndex-1][columnIndex-1] != matrix[rowIndex][columnIndex]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean betterSolution(int[][] matrix) {
        Map<Integer, Integer> group = new HashMap<>();
        for (int rowIndex = 1;
             rowIndex < matrix.length;
             rowIndex ++) {
            for (int columnIndex = 1;
                 columnIndex < matrix[rowIndex].length;
                 columnIndex ++){
                if (!group.containsKey(rowIndex-columnIndex)){
                    group.put(rowIndex-columnIndex, matrix[rowIndex][columnIndex]);
                } else if (group.get(rowIndex-columnIndex) != matrix[rowIndex][columnIndex]) {
                    return false;
                }
            }
        }
        return true;
    }
}
