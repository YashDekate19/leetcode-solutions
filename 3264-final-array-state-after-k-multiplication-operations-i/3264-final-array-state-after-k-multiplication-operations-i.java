class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i = 0 ; i<k ; i++){
            int min = 0 ;
            for(int j = 0 ; j<nums.length;j++){
                // for(int k = 0 ; k < nums.length;k++){

                // }/
                if(nums[min]>nums[j]){
                    min = j;
                }
                

            }
            nums[min]*=multiplier;
        }
        return nums;
        
    }
}