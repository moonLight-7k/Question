
public class singleNumber {
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

// ================= SECOND SOLUTION =================
/*
 * class Solution {
 * public int singleNumber(int[] nums) {
 * Arrays.sort(nums);
 * if(nums.length==1){
 * return nums[0];
 * }
 * for(int i=0;i<nums.length-1;i+=2){
 * if(nums[i]!=nums[i+1]){
 * return nums[i];
 * }
 * }
 * return nums[nums.length-1];
 * }
 */

// =================== THIRD SOLUTION ===================
/*
 * class Solution {
 * public int singleNumber(int[] nums) {
 * int result = 0;
 * for (int i = 0; i < nums.length; i++) {
 * result ^= nums[i];
 * }
 * return result;
 * }
 * }
 */