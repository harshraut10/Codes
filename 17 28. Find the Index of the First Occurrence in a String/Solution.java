public class Solution {

    public static int strStr(String haystack, String needle) {
        int z=0,count=0,index=-1;
        //System.out.println(needle.length());
        for (int i=0;i< haystack.length(); i++){
            z=i; count=0;
            for(int j=0;j< needle.length(); j++){
                if(needle.charAt(j)==haystack.charAt(z) ){
                    index=i;
                    z++;
                    count++;
                   // System.out.println("inside "+count);
                    if(count==needle.length()) return index;
                }else break;
            }
        }
        //System.out.println(index);
        if (count==needle.length()) return index;
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(strStr("leetcode", "leeto"));
    }
}
