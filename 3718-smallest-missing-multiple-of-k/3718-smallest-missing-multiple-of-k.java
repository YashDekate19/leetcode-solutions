class Solution {
    public int missingMultiple(int[] nums, int k) {
        int ans = 0;
        for(int i = 1 ; i<=nums.length+1;i++){
            int x = 0 ;
            for(int j = 0 ; j<nums.length;j++){
                if(i*k==nums[j]){
                    x=1;
                }
            }
            if(x!=1){
                ans=i*k;
                break;
            }

        }
        return ans;
        
    }
}