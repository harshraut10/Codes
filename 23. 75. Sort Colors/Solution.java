public class Solution {
    public void sortColors(int[] nums) {
        // for(int i=0;i<nums.length; i++){
        //     if(i<nums.length-1)
        //       if(nums[i]>nums[i+1]){
        //             int temp=nums[i+1];
        //             nums[i+1]=nums[i];
        //             nums[i]=temp;
        //         }
        // }

        for(int i=0;i<nums.length-i-1;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}
