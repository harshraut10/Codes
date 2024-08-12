import java.util.*;
class Solution {
    public static int removeDuplicates(int[] nums) {
        int i=1;
        for (int j=i; j<nums.length;j++){
            if(nums[j]!= nums[i-1]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int [] arr= new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}