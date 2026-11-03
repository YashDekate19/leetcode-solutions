class Solution {
    public int minMoves(int[] nums) {
        int m = 0;
        for(int x : nums){
            if(m<x){
                m=x;
            }
        }
        int ans = 0;
        for(int  x : nums){
            ans+=m-x;

        }
        return ans;
        
    }
}