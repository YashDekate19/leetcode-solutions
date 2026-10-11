class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long totalK = (long) k1 + k2;
        
        int maxDiff = 0;
        long sumDiff = 0;
        int[] diff = new int[n];
        
        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            sumDiff += diff[i];
            if (diff[i] > maxDiff) {
                maxDiff = diff[i];
            }
        }
        
        if (sumDiff <= totalK) {
            return 0;
        }
        
        int[] bucket = new int[maxDiff + 1];
        for (int d : diff) {
            bucket[d]++;
        }
        
        for (int d = maxDiff; d > 0 && totalK > 0; d--) {
            if (bucket[d] > 0) {
                long take = Math.min(totalK, (long) bucket[d]);
                bucket[d] -= take;
                bucket[d - 1] += take;
                totalK -= take;
            }
        }
        
        long res = 0;
        for (int d = 1; d <= maxDiff; d++) {
            if (bucket[d] > 0) {
                res += (long) bucket[d] * d * d;
            }
        }
        
        return res;
    }
}
