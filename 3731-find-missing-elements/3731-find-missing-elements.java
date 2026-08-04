class Solution {
    public List<Integer> findMissingElements(int[] nums) {
         List<Integer> res = new ArrayList<>(); 
        
        if (nums == null || nums.length == 0) return res;

        int min = nums[0]; 
        int max = nums[0]; 
        
        for (int i = 0; i < nums.length; i++) { 
            if (nums[i] > max) { 
                max = nums[i]; 
            } 
            if (nums[i] < min) { 
                min = nums[i]; 
            } 
        } 

        for (int i = min; i <= max; i++) { 
            res.add(i); 
        } 

        for (int i = res.size() - 1; i >= 0; i--) { 
            for (int j = 0; j < nums.length; j++) { 
                if (res.get(i) == nums[j]) { 
                    res.remove(i); 
                    break; 
                } 
            } 
        } 
        
        return res; 
        
    }
}