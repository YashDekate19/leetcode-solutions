import java.util.Stack;

class Solution { 
    public int evalRPN(String[] tokens) { 
        int x1 = 0; 
        int x2 = 0; 
        Stack<Integer> stack = new Stack<>(); 
        
        for (int i = 0; i < tokens.length; i++) { 
            if (tokens[i].equals("+")) { 
                x1 = stack.pop(); 
                x2 = stack.pop(); 
                stack.push(x2 + x1); 
            } else if (tokens[i].equals("-")) { 
                x1 = stack.pop(); 
                x2 = stack.pop(); 
                stack.push(x2 - x1); 
            } else if (tokens[i].equals("/")) { 
                x1 = stack.pop(); 
                x2 = stack.pop(); 
                stack.push(x2 / x1); 
            } else if (tokens[i].equals("*")) { 
                x1 = stack.pop(); 
                x2 = stack.pop(); 
                stack.push(x2 * x1); 
            } else { 
                stack.push(Integer.parseInt(tokens[i])); 
            } 
        } 
        return stack.peek(); 
    } 
}
