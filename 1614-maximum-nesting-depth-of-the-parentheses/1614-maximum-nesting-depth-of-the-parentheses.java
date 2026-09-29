class Solution {
    public int maxDepth(String s) {
        int len = 0;
        int max = 0;
        for(char x : s.toCharArray()){
            if(x=='('){
                len++;

            }
            if(x==')'){
                if(len>=max){
                    max = len;
                }
                len--;

            }


        } 
        return max; 
        
    }
}