import java.util.Stack;

class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(sb.length());
            } else if (ch == ')') {
                int start = stack.pop();
                int end = sb.length() - 1;
                while (start < end) {
                    char temp = sb.charAt(start);
                    sb.setCharAt(start, sb.charAt(end));
                    sb.setCharAt(end, temp);
                    start++;
                    end--;
                }
            } else {
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}
