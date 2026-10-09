class Solution {
    public int minInsertions(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int insertions = 0;
        int length = s.length();
        
        for (int i = 0; i < length; i++) {
            char x = s.charAt(i);
            
            if (x == '(') {
                stack.push('(');
            } else {
                if (i + 1 < length && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    insertions++;
                }
                
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    insertions++;
                }
            }
        }
        
        insertions += stack.size() * 2;
        
        return insertions;
    }
}
