import java.util.Arrays;

class Solution { 
    public long maxAlternatingSum(int[] nums) { 
        for (int i = 0; i < nums.length; i++) { 
            nums[i] = Math.abs(nums[i]); 
        } 
        
        Arrays.sort(nums); 
        
        long sum1 = 0; 
        for (int i = 0; i < nums.length / 2; i++) { 
            sum1 += ((long) nums[i] * nums[i]); 
        } 
        
        long sum2 = 0; 
        for (int i = (nums.length / 2); i < nums.length; i++) { 
            sum2 += ((long) nums[i] * nums[i]); 
        } 
        
        return sum2 - sum1; 
    } 
}
