package LeecodeEasyQ;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by yifanfan on 6/08/15.
 */
public class Anagram {
    public List<String> anagrams(String[] strs) {
        if(strs == null || strs.length == 0) {
            return Collections.<String>emptyList();
        }
        Hashtable map= new Hashtable();
        List<String> result= new ArrayList();
        String t="";
        int index = 0;
        for(String s: strs){
            t=this.stringSort(s);
            if(!map.containsKey(t)){
                map.put(t,index);
            }else{
                if((Integer)map.get(t)!= -1) {
                    result.add(strs[(Integer)map.get(t)]);
                    map.put(t,-1);
                }
                result.add(s);
            }
            index++;

        }
        return result;

    }
    public String stringSort(String str) {
        char[] tem=  str.toCharArray();
        Arrays.sort(tem);
        return new String(tem);
    }

}
