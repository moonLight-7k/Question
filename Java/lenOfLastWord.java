class Solution {
    public int lengthOfLastWord(String s) {

        s = s.trim();

        if (s.length() == 0) {
            return 0;
        } else if (s.length() == 1) {
            return 1;

        } else {
            return s.substring(s.lastIndexOf(' ')).length() - 1;
        }
    }
}