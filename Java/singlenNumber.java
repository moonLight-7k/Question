public class singlenNumber {
    public int singleNumber(int[] nums) {

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int count = 0;

            for (int j = 0; j < len; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }

            }
            if (count == 1) {
                return nums[i];
            }
        }
        return 0;
    }
}