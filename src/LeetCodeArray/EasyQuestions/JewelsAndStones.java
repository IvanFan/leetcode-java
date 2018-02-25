package LeetCodeArray.EasyQuestions;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

/**
 * Created by yifanfan on 22/2/18.
 */
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        if (J == null || S == null || J.length() == 0 || S.length() == 0 ) {
            return 0;
        }
        int totalJewels = 0;
        Hashtable<Character, Boolean> jewelsHashTable = new Hashtable<>();

        for (int i = 0;
             i < J.length();
             i ++) {
            jewelsHashTable.put(J.charAt(i), true);
        }
        for (int stoneIndex = 0;
                stoneIndex < S.length();
                stoneIndex ++ ) {
            if (jewelsHashTable.get(S.charAt(stoneIndex)) != null){
                totalJewels ++;
            }
        }
        return totalJewels;
    }

    public int betterSolution(String J, String S){
        Set<Character> jSet = new HashSet<>();
        for (char j: J.toCharArray()) {
            jSet.add(j);
        }
        int result = 0;
        for (char s: S.toCharArray()) {
            if (jSet.contains(s)) {
                result ++;
            }
        }
        return result;
    }
}
