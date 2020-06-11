import java.util.*;

public class Parenthesis {
    public static void main(String[] args) {
        String str = "({)}";
        System.out.println(str);
        Boolean isBalanced = checkParenthesis(str);
        System.out.println(isBalanced);
    }

    public static boolean checkParenthesis(String str) {

        Stack<Character> stack = new Stack<Character>();
        Boolean isBalanced = true;

        for (int i=0; i<str.length(); i++) {
            char curr = str.charAt(i);

            if (curr == '{' || curr == '(' || curr == '[') {
                stack.push(curr);
            } else {
               if (curr == '}' && stack.pop() == '{') {
                   System.out.println('}');

               } else if (curr == ']' && stack.pop() == '[') {
                   System.out.println(']');

               } else if (curr == ')' && stack.pop() == '(') {
                   System.out.println(')');
                   
               } else {
                   isBalanced = false;
                   break;
               }
            }

        }

        return isBalanced;
    }


}