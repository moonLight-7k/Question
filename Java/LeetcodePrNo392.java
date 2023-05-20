class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0, j = 0;
        int tLen = t.length();
        int mLen = s.length();
        char sArr[] = s.toCharArray();
        char dArr[] = t.toCharArray();

        if (mLen < 1)
            return true;

        while (i < tLen) {
            if (dArr[i] == sArr[j]) {
                j++;
            }
            i++;

            if (j == mLen)
                return true;
        }

        return false;

    }
}