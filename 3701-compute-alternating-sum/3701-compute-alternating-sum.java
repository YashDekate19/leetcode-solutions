class Solution {
    public int alternatingSum(int[] nums) {
        int res = 0;
        for(int i = 0 ;i<nums.length;i+=2){
            
            res+=nums[i];
            if(i<nums.length-1){
                res-=nums[i+1];

            }
        }
        return res;
        
    }
}