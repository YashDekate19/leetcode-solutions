class Solution {
    public int[] concatWithReverse(int[] nums) {
        int l = nums.length*2 ;
       int[] ans = new int[l];
        for(int i = 0 ; i < nums.length ; i++){
            ans[i]=nums[i];
        }
        for(int i = nums.length  ; i <l ; i++){
            ans[i]=nums[l - i - 1];
        }
        return ans;
        
    }
}