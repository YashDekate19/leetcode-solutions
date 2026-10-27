class Solution {
    public int matrixSum(int[][] nums) {
        int score = 0;
        int m = nums.length;
        int n = nums[0].length;
        for(int i = 0 ; i<m;i++){
            Arrays.sort(nums[i]);
        }
        for(int i = 0 ; i<n;i++){
            int h =0;
            for(int j = 0; j<m;j++){
                if(nums[j][i]>h){
                    h = nums[j][i];
                }
            }
            score+=h;
        }
        return score;
        
    }
}