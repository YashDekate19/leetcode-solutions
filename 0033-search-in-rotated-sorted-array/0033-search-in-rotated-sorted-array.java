class Solution {
    public int search(int[] nums, int target) {
        
        if(nums[0]==target){
            return 0;
        }else if(nums[nums.length-1]==target){
            return nums.length-1;
        }else{
            for(int i = 1; i<nums.length-1;i++){
                if(nums[i]==target){
                    return i;
                }
            }
        }
        return -1;
    }
}