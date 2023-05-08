class Solution {
    public int balancedStringSplit(String s) {

        int lC = 0, rC = 0, ans = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'L') {
                lC++;
            } else {
                rC++;
            }
            if (lC == rC) {
                ans++;
                lC = 0;
                rC = 0;
            }
        }

        return ans;
    }
}