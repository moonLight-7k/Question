import java.io.*;
import java.util.*;

public class stringIntro {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s1 = scan.nextLine();
        String s2 = scan.nextLine();

        int sumOfLengths = s1.length() + s2.length();
        System.out.println(sumOfLengths);

        if (s1.compareTo(s2) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String ans3 = s1.substring(0, 1).toUpperCase() + s1.substring(1);
        String ans31 = s2.substring(0, 1).toUpperCase() + s2.substring(1);

        System.out.println(ans3 + " " + ans31);

    }
}
