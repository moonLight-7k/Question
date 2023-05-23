class Solution {
    public String longestNiceSubstring(String s) {
        if (s.length() < 2)
            return "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!s.contains(Character.toUpperCase(ch) + "") || !s.contains(Character.toLowerCase(ch) + "")) {
                String subStr1 = longestNiceSubstring(s.substring(0, i));
                String subStr2 = longestNiceSubstring(s.substring(i + 1));
                return subStr1.length() >= subStr2.length() ? subStr1 : subStr2;
            }
        }

        return s;
    }
}