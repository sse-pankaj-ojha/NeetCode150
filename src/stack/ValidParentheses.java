package stack;

import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/
//20. Valid Parentheses
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
