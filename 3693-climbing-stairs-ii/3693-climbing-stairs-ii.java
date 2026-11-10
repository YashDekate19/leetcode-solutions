
class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] f = new int[n + 1];
        Arrays.fill(f, Integer.MAX_VALUE / 2);
        f[0] = 0;

        for (int i = 1; i <= n; ++i) {
            int stepCost = costs[i - 1];
            for (int j = Math.max(0, i - 3); j < i; ++j) {
                int jumpDistance = i - j;
                f[i] = Math.min(f[i], f[j] + stepCost + (jumpDistance * jumpDistance));
            }
        }

        return f[n];
    }
}
