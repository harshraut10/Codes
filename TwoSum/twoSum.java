import java.util.*;
class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hp= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target- nums[i];

            if(hp.containsKey(complement)){
                return new int[]{
                    hp.get(complement), i
                };
            }

        hp.put(nums[i], i);
        }
        return null;
    }

    public static void main(String args[]){
        int[] arr= new int[]{2,8,11,15,7};
        int target=9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
}