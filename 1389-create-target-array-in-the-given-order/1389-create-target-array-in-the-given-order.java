class Solution { 
    public int[] createTargetArray(int[] nums, int[] index) { 
     
        List<Integer> lst = new ArrayList<>(); 
        
        for (int i = 0; i < nums.length; i++) { 
            lst.add(index[i], nums[i]); 
        } 
        
        int[] ans = new int[lst.size()]; 
        for (int i = 0; i < lst.size(); i++) {
            ans[i] = lst.get(i);
        }
        
        return ans; 
    } 
}
