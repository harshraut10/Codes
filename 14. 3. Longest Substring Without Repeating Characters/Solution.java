import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {

    public static boolean check(String s, int start, int end){
        Set<Character> str= new HashSet<>();

        while (start<=end) {
            if(!str.add(s.charAt(start))){
                return false;
            }
            start++;
        }
        return true;
    }
    public static int lengthOfLongestSubstring(String s) {
        int start=0,end=0,maxLen=1;
        if(s.length()==0) return 0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    break;
                }else{
                    start=i;
                    end=j;
                    System.out.println(i+" "+j);
                    if((end-start+1)>maxLen){
                        if(check(s, start, end))
                        maxLen=(end-start)+1;
                        System.out.println(i+" "+j );
                        System.out.println(maxLen);
                    }
                    
                    //System.out.println(maxLen44);
                }
            }
        }

        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbbcolp"));
    }

    
}