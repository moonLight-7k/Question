import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> visitedNum = new HashSet<>();

        while (n != 1 && !visitedNum.contains(n)) {
            visitedNum.add(n);
            n = getSqrSumOfDigits(n);
        }

        return n == 1;
    }

    private static int getSqrSumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
