class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int partitionCount = 1;
        int currentMin = nums[0];

        for (int val : nums) {
            if (val - currentMin > k) {
                currentMin = val;
                partitionCount++;
            }
        }
        return partitionCount;
    }
}
