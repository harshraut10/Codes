import java.util.*;
class Solution {
    public static int lengthOfLastWord(String s) {
        int count = 0;
        String [] token = s.split(" ");
        count=token[token.length-1].length();
        return count;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hi hello  "));
    }
}