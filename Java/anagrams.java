import java.io.*;
import java.util.*;
import java.lang.String;

public class anagrams {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        int len1 = str1.length();
        int len2 = str2.length();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (len1 != len2) {
            System.out.print("Not Anagrams");
        } else {

            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            boolean ans = Arrays.equals(arr1, arr2);

            if (ans) {
                System.out.print("Anagrams");
            } else {
                System.out.print("Not Anagrams");
            }

        }

    }
}
