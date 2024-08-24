import java.util.Arrays;

class Solution {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String start= strs[0];
        String end= strs[strs.length-1];
        //System.out.println(start + " "+ end);
        String pre="";
        for(int i=0;i< Math.min(start.length(),end.length());i++){
            if(start.charAt(i)!= end.charAt(i)){
                return pre;
            }else{
                pre+=start.charAt(i);
            }
        }

        return pre;
    }

    public static void main(String[] args) {
        String [] str= new String[]{"dog","racecar","car"};
        System.out.println(longestCommonPrefix(str));
    }
}