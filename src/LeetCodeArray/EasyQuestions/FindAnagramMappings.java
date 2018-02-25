package LeetCodeArray.EasyQuestions;

import java.util.Hashtable;

/**
 * Created by yifanfan on 23/2/18.
 */
public class FindAnagramMappings {
    public int[] anagramMappings(int[] A, int[] B) {
        Hashtable<Integer, Integer> bHashTable = new Hashtable<>();
        for (int b = 0; b < B.length; b ++){
            bHashTable.put(B[b], b);
        }
        int result[] = new int[A.length];
        for (int a = 0; a < A.length; a ++) {
            result[a] = bHashTable.get(A[a]);
        }
        return result;
    }
}
