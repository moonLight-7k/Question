import java.util.*;

public class subString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        int start = scan.nextInt();
        int end = scan.nextInt();

        String ans = S.substring(start, end);

        System.out.println(ans);
    }
}