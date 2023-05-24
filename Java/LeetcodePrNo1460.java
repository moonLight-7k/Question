import java.util.Arrays;

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (target[i] == arr[i]) {
                count++;
            }
        }
        return count == arr.length ? true : false;

    }
}