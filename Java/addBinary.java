class Solution {
    public String addBinary(String a, String b) {

        int carry = 0, i = a.length() - 1, j = b.length() - 1;

        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry == 1) {

            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            carry = sum >> 1;
            result.insert(0, sum & 1);
        }
        return result.toString();
    }

}