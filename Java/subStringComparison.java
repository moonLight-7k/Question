import java.util.*;
import java.lang.String;

public class subStringComparison {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        int k = scan.nextInt();

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }
    

        System.out.print(smallest + "\n" + largest);

    }
}