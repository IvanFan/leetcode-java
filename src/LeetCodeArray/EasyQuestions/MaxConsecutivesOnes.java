package LeetCodeArray.EasyQuestions;

/**
 * Created by yifanfan on 25/2/18.
 */
public class MaxConsecutivesOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveAmount = 0;
        int currentConsecutiveAmount = 0;
        for (int num = 0; num < nums.length; num ++) {
            // trigger start
            if (nums[num] == 1) {
                currentConsecutiveAmount ++;
            } else {
                maxConsecutiveAmount = maxConsecutiveAmount<currentConsecutiveAmount?currentConsecutiveAmount:maxConsecutiveAmount;
                currentConsecutiveAmount = 0;
            }
        }
        maxConsecutiveAmount = maxConsecutiveAmount<currentConsecutiveAmount?currentConsecutiveAmount:maxConsecutiveAmount;
        return maxConsecutiveAmount;
    }
}
