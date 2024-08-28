public class Solution {
    public static int maxProfit(int[] prices) {
        int d1=0,d2=0;
        int maxProf=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(maxProf< (prices[j]-prices[i])){
                    maxProf=(prices[j]-prices[i]);
                    d1=i+1;
                    d2=j+1;
                }
            }
        }
        //System.out.println(d1+" "+d2);
        return maxProf;
    }

    public static void main(String[] args) {
        int [] arr= new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
