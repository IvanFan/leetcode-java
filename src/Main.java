
import LeecodeEasyQ.Anagram;
import LeecodeEasyQ.Pascal2;
import LeecodeEasyQ.ValidAnagram;
import LeecodeEasyQ.pascal;
import LeetCodeArray.EasyQuestions.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test start");
        WiggleSort test = new WiggleSort();
        int[] nums =new int[] {3, 5, 2, 1, 6, 4};
        test.wiggleSort(nums);
        System.out.print(Arrays.toString(nums));
    }

}
