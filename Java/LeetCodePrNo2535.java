class Solution {
    public int differenceOfSum(int[] nums) {

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];

        }
        for (int j = 0; j < nums.length; j++) {

            while (nums[j] > 0) {
                sum2 += nums[j] % 10;
                nums[j] = nums[j] / 10;
            }
        }

        return Math.abs(sum1 - sum2);

    }
}