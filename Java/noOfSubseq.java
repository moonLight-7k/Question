class Solution {

    public int numSubseq(int[] nums, int target) {

        int res = 0, n = nums.length, mod = (int) 1e9 + 7;
        
        for (int i = 0; i < (1 << n); i++) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    min = Math.min(min, nums[j]);
                    max = Math.max(max, nums[j]);
                }
            }
            if (min + max <= target)
                res = (res + 1) % mod;
        }
        return res - 1;
    }
}