package LeecodeEasyQ;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yifanfan on 5/08/15.
 */
public class pascal {
    public List<List<Integer>> generate(int numRows) {
        ArrayList results=new ArrayList();
        for(int i=1;i<=numRows;++i){

            ArrayList currentLevel=new ArrayList();
            for(int j=0;j<i;++j){
                if(j==0){
                    currentLevel.add(1);
                }else if(j==i-1){
                    currentLevel.add(1);
                }else {
                    currentLevel.add((Integer) ((ArrayList) results.get(i - 2)).get(j) + (Integer) ((ArrayList) results.get(i - 2)).get(j - 1));
                }
            }
            results.add(currentLevel);
        }
        return results;
    }
}
