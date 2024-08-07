class Solution {
    public static boolean isPalindrome(int x) {
        int n=x;
        int digit=0;
        while(n>0){
            int t=n%10;
            digit=digit*10 + t;                                 
            n/=10;

        }
        if(digit==x)
        return true;
        else
        return false;
    }

    public static void main(String[] args) {
        int x=121;
        System.out.println(isPalindrome(x));
    }
    
}