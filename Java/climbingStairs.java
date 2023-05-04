class Solution {
    public int climbStairs(int n) {
        if (n <= 3)
            return n;

        int first = 2, second = 3, third = 0;

        for (int i = 3; i < n; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }
}