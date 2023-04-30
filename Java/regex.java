import java.util.Scanner;

class Solution {

    private static final String IPV4_REGEX = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    private static final String IPV6_REGEX = "^([0-9a-fA-F]{1,4}:){7}([0-9a-fA-F]{1,4})$";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String IP = scan.next();
            boolean isValid = IP.matches(IPV4_REGEX) || IP.matches(IPV6_REGEX);
            System.out.println(isValid);
        }
    }
}
