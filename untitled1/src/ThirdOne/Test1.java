package ThirdOne;

public class Test1 {

        public static void main(String args[]){
            String s="abcd";
            String s2="";
            for(int i=0;i<s.length();i++){
                s2="";
                for(int j=i;j<s.length();j++){
                    s2+=s.charAt(j);
                    System.out.println(s2);
                }
            }
        }
    }

