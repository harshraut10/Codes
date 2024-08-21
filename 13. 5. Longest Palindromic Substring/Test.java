class Test {

    public static boolean check(int start,int end, String s){
        
        //System.out.println(start+ " "+ end);
        while (start<=end) {
            if(s.charAt(start)== s.charAt(end)){
                        end--;
                        start++;
                } else return false;
        }
        return true;
    }
    public static String longestPalindrome(String s) {
        char start;
       
        if(s.length()==1){
            return s;
        }
        String str="";
        boolean flag=true;
        int end=9999999, starti=0;
        for(int i=0;i<s.length();i++){
            start= s.charAt(i);
            starti=i;
            int l=i+1;
            
            for( int j=l ; j<s.length();j++){
                if (s.charAt(j) == start){
                    end=j;  
                    flag=false;
                    //System.out.println(starti+" "+ end);
                    //System.out.println(end);
             }
                
             }
             if(end == 9999999) continue;
             if(check(starti, end, s)){
               
                // for( i=starti;i<=(end-starti+1);i++)
                // str=str+ s.charAt(i);
                while(starti<=end){
                    str= str + s.charAt(starti);
                    starti++;
                }
                //System.out.println(str);
                return str;
                
            }
            
        }
        
        str += s.charAt(0);
        return str;
    }
     public static void main(String[] args) {
        System.out.println(longestPalindrome("ccc"));
     }
    
}