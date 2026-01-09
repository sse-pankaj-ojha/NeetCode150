package stack;

import java.util.Stack;

public class ValidParentheses {
    static void main() {
        String s = "()";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack  = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c =='['){
                stack.push(c);
            }else {
                if(stack.isEmpty()) return false;
                if(c == '}' && stack.pop() != '{'){
                    return false;
                }
                if(c == ')' && stack.pop() !='('){
                    return false;
                }
                if(c == ']' && stack.pop() != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
