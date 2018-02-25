package LeecodeEasyQ;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yifanfan on 5/08/15.
 */
public class Pascal2 {
    public  List<Integer> getRow(int rowIndex) {
        List results=new ArrayList();
        if (rowIndex==0) {

            results.add(1);
            return results;
        }else{
            results=this.getRow(rowIndex - 1);
            for(int i=rowIndex;i>0;--i){
                if(i==rowIndex){
                    results.add(1);
                }else{
                    results.set(i,(Integer)results.get(i)+(Integer)results.get(i-1));
                }
            }
            return results;
        }

    }

}
