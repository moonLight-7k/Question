import java.util.Arrays;

class Solution {
    public double average(int[] salary) {

        int n = salary.length;
        Arrays.sort(salary);

        double sum1 = 0;
        for (int i = 1; i < n - 1; i++) {
            sum1 += salary[i];

        }

        double ans = sum1 / (n - 2);
        return ans;

    }
}
