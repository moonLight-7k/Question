import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sort_square = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sort_square[i] = nums[i] * nums[i];
        }
        Arrays.sort(sort_square);

        return sort_square;

    }
}