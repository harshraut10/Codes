
public class Solution {
    public static int  slength=0;
    public static int i=0,j=0,limit=0;
    public static void doit(int i,int j, String s, int numRows,int task, char matrix[][],int limit){
        if(task==0)// down
        {
            if(j==numRows)j--;
            while(i<numRows && limit<numRows && slength<s.length()){
                matrix[i][j]=s.charAt(slength);
                i++;
                slength++;
                limit++;
            }
            return;
        }
        else if(task==1 )//up
        {   if(i==numRows)i--;
            while(j<numRows && limit<numRows && slength<s.length()){
                i--;
                matrix[i][j]=s.charAt(slength);
                slength++;
                j++;
                limit++;

            }
            return;
        }
    }
    public static String convert(String s, int numRows) {
       
        char matrix[][]=new char[numRows][numRows+4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ' '; // Assign space character to each cell
            }
        }
        
        while(slength<s.length()){
            limit=0;
            if(i<numRows){
               doit(i, j, s, numRows, 0, matrix,limit);
            }
            else if(j<numRows){
                doit(i, j, s, numRows, 1, matrix,limit);

            }
        }
        displayCharArray(matrix);
        return "";
    }


    public static void displayCharArray(char[][] array) {
        for (int i = 0; i < array.length; i++) { // Loop through each row
            for (int j = 0; j < array[i].length; j++) { // Loop through each column
                System.out.print(array[i][j] + " "); // Print each element followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    public static void main(String[] args) {
        convert("PAYPALISHIRING", 4);
    }
}