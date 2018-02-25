package LeecodeEasyQ;

import java.util.Hashtable;

/**
 * Created by yifanfan on 6/08/15.
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if(s== null || t ==null){
            return false;
        }
        if(s.length()==t.length()){
            Hashtable balance = new Hashtable();
            for(int i=0;i<s.length();++i){
                if(balance.get(s.charAt(i))!=null){
                    balance.put(s.charAt(i),(Integer)balance.get(s.charAt(i))+1);
                }else{
                    balance.put(s.charAt(i),1);
                }

            }
            for(int i=0;i<t.length();++i){

                if(balance.get(t.charAt(i))==null || (Integer)balance.get(t.charAt(i))<=0){
                     return false;
                }else{
                    balance.put(t.charAt(i),(Integer)balance.get(t.charAt(i))-1);
                }
            }
            return true;

        }
        return false;


    }
}
