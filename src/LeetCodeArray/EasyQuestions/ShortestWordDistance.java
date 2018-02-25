package LeetCodeArray.EasyQuestions;

/**
 * Created by yifanfan on 25/2/18.
 */
public class ShortestWordDistance {
    public int shortestDistance(String[] words, String word1, String word2) {
        int wordAIndex = -1;
        int wordBIndex = -1;
        int shortDistance = words.length;
        int index = 0;
        for(String word: words) {
            if (word.equals(word1)){
                wordAIndex = index;
            }
            if (word.equals(word2)){
                wordBIndex= index;
            }
            if (wordBIndex != -1 && wordAIndex!= -1){
                shortDistance= shortDistance>Math.abs(wordAIndex-wordBIndex)?Math.abs(wordAIndex-wordBIndex):shortDistance;
            }
            index++;
        }
        return shortDistance;
    }
}
