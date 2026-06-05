class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }
            else{
                if( stack.isEmpty() || (ch==')' && stack.peek()!='(')){
                    return false;
                }
                else if( stack.isEmpty() || (ch==']' && stack.peek()!='[')){
                    return false;
                }
                else if( stack.isEmpty() || (ch=='}' && !stack.isEmpty() && stack.peek()!='{')){
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
