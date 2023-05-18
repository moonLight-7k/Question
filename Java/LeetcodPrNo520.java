// =============Solution 1================

// class Solution {
//     public boolean detectCapitalUse(String word) {
//         if(word.length()==1)
//             return true;

//         else
//             return word.matches("[A-Z]*|.[a-z]*");

//     }
// }

// ================ SOlution 2 =============
class Solution {
    public boolean detectCapitalUse(String word) {

        int n = word.length();

        if (n == 1)
            return true;

        boolean case1 = true, case2 = true, case3 = true;

        // Case1
        if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
            for (int i = 2; i < n; i++) {
                if (!Character.isUpperCase(word.charAt(i))) {

                    return case1 = false;
                }
            }
        }
        // Case2
        else if (Character.isUpperCase(word.charAt(0))) {
            for (int i = 1; i < n; i++) {
                if (!Character.isUpperCase(word.charAt(i))) {

                    return case2 = false;
                }
            }
        } else {

            for (int i = 0; i < n; i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return case3 = false;
                }
            }
        }

        return case1 && case2 && case3;

    }

}