class Solution {
    public String interpret(String command) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                ans.append('o');
                i++;
            } 
            else if (command.charAt(i) == '(') {
                i++;
                ans.append(command.charAt(i));
            } else if(command.charAt(i) == ')'){
                
            }
            else {
                ans.append(command.charAt(i));
            }
        }

        return ans.toString();
    }
}