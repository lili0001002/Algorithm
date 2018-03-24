package ThirdOne;

import java.util.HashMap;
import java.util.Map;

public class Test {
    static Map<String,Integer> map = new HashMap<>();

    public static void main(String args[]){
        String s = "abc";
        getString(s);
    }

    /**
     * author:      Daniel
     * description: 通过递归来查询输出子串
     */
    static void getString(String s){
        if(s.length() == 1){
            if(!map.containsKey(s)) {
                System.out.print(s + " ");
                map.put(s, 1);
            }
            return;
        }
        if(!map.containsKey(s)) {
            System.out.print(s+" ");
            map.put(s, 1);
        }

        for(int i = 0;i<s.length();i++){
            String newString = s.substring(0,i)+s.substring(i+1,s.length());
            getString(newString);
        }

    }
}
