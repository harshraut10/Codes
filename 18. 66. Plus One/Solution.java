import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public static int[] plusOne(int[] digits) {
        //ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        int temp=0;
        for(int i=0;i<digits.length;i++){
            temp=temp*10 + digits[i];
        }
        temp=temp+1;

        List<Integer> al = new ArrayList<>();
        while(temp>0){
            int digit = temp % 10; // Get the last digit
            al.add(digit);
            temp = temp / 10;

        }
        Collections.reverse(al);
        int[] intArray = new int[al.size()];

        for (int i = 0; i < al.size(); i++) {
            intArray[i] = al.get(i); // Assign each element to the array
        }
        return intArray;
    }

    public static void main(String[] args) {

        int [] digit=new int[]{9,9};
        int m=4321;
        int length=4;
       

       digit=plusOne(digit);
       for (int i : digit) {
        System.out.print(i + " ");
    }
    }
}