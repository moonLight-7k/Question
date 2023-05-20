class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0, j = 0;
        int n = t.length();
        int m = s.length();
        char S[] = s.toCharArray();
        char D[] = t.toCharArray();

        if (m < 1)
            return true;

        while (i < n) {
            if (D[i] == S[j]) {
                j++;
            }
            i++;

            if (j == m)
                return true;
        }

        return false;

    }
}