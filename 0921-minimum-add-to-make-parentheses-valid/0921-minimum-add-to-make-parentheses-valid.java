import java.util.Stack;

class Solution { 
    public int minAddToMakeValid(String s) { 
        Stack<Character> stack = new Stack<>(); 
        
        for (char x : s.toCharArray()) { 
            if (x == '(') { 
                stack.push(x); 
            } else { 
                if (stack.isEmpty()) { 
                    stack.push(x); 
                } else { 
                    if (stack.peek() == '(') { 
                        stack.pop(); 
                    } else {
                        stack.push(x); 
                    }
                } 
            } 
        } 
        return stack.size(); 
    } 
}
