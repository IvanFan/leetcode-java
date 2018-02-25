package LeecodeEasyQ;

import java.util.HashMap;

/**
 * Created by yifanfan on 27/11/15.
 */
public class matchmasdf {

        public static int indexOfLongestRun(String str) {
            if(str ==null){
                return 0;
            }
            if(str.length()==1){
                return 1;
            }
            char[] charArray =str.toCharArray();
            HashMap map=new HashMap();

            int sum=0;
            int longest=0;
            int index=0;
            char tem=charArray[0];
            for(int i=1;i< charArray.length;i++){
                if(tem ==charArray[i]){
                    sum++;
                }else {
                    index=i;

                    tem=charArray[i];

                    map.clear();
                    if (longest<sum) {
                        longest=sum;
                    }

                    sum = 0;
                }

            }
            return index;
        }

        public static void main(String[] args) {
            System.out.println(indexOfLongestRun("abbcccddddcccbba"));
        }

}
