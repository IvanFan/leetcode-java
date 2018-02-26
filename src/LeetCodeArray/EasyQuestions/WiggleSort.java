package LeetCodeArray.EasyQuestions;

/**
 * Created by yifanfan on 26/2/18.
 */
public class WiggleSort {
    public void wiggleSort(int[] nums) {
        for(int index = 0; index < nums.length -1; index ++) {
            if (index%2!=1) {
                if (nums[index] > nums[index+1]) {
                    int temp = nums[index];
                    nums[index] = nums[index+1];
                    nums[index+1] = temp;
                }
            } else {
                if (nums[index] < nums[index+1]) {
                    int temp = nums[index];
                    nums[index] = nums[index+1];
                    nums[index+1] = temp;
                }
            }
        }

    }
}
