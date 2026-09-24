class Solution {
    public int smallestIndex(int[] nums) {
        
        for(int i = 0 ; i<nums.length;i++){
            int x = nums[i];
            int res = 0 ;
            int r = 0;
            while (x>0){
                r = x%10;
                res+=r;
                x/=10;
            }
            if(res==i){
                return i;
            }
        }
        return -1;
        
    }
}


