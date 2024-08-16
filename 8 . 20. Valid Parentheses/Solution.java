class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' || c == '[' || c == '{'){
                stack.push(c);
            }
                else{
                     char top = stack.peek();
                if ((c == ')' && top == '(') ||
                 (c == ']' && top == '[') || (c == '}' && top== '{')) {
                    // If it is, pop the opening bracket from the stack
                    stack.pop();
                } else { // Otherwise, the brackets don't match, so return false
                    return false;
                }
                }
               
        }

        if(stack.empty())
            return true;
        
        return false;

    }
}