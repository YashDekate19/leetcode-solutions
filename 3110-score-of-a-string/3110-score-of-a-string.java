class Solution {
    public int scoreOfString(String s) {
        int[] arr= new int[s.length()];
        for(int i = 0 ;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        int res = 0;
        int x = 0;
        for(int i = 0 ;i<s.length()-1;i++){
            x = arr[i]-arr[i+1];
            if(x<0){
                x = (-1)*x;
            }
            res+=x;
        }
        return res;

        
    }
}