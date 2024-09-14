import java.util.ArrayList;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1=0,n2=0,k=0;
        int[] a= new int[n+m];
        int temp=0;
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i=0;i<m;i++){
            array.add(nums1[i]);
        }

        for(int i=0;i<n;i++){
            array.add(nums2[i]);
        }

        array.sort(null);

        for (int i = 0; i < array.size(); i++) {
            nums1[i]=array.get(i);
          }

          for(int i=0;i<nums1.length;i++)
          System.out.println(nums1[i]);

    }

    public static void main(String[] args) {
        int[] nums1= new int[]{1,2,3,0,0,0};
        int[] nums2= new int[]{2,5,6};
        merge(nums1, 3, nums2, 3);
    }

    
}