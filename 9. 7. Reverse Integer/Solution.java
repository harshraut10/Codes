class Solution {
    public int reverse(int x) {
        int rev=0,temp;
        int og=x;
        if(x<0){
            og = x + x*(-2);
        }
        while(og > 0){
            temp=og%10;
            rev =  temp + rev*10;
            og=og/10;
        }
        if(x>0)
        return rev;
        else{
            og= rev - 2*rev;
            return og;
        }
    }
}