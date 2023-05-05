class Solution {
    public int maxVowels(String s, int k) {

        int maxVowels = 0, currentVowels = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (i >= k && isVowel(arr[i - k])) {
                currentVowels--;
            }
            if (isVowel(arr[i])) {
                currentVowels++;
            }
            maxVowels = Math.max(maxVowels, currentVowels);
        }
        return maxVowels;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
