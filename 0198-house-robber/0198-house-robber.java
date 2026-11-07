class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int p2 = 0; 
        int p1 = 0; 
        
        for (int num : nums) {
            int current = Math.max(p1, p2 + num);
            p2 = p1;
            p1 = current;
        }
        
        return p1;
    }
}
