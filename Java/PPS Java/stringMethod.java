import java.util.Scanner;

public class stringMethod {
    public static int strlen(String str) {
        int len = 0;
        for (int i = 0; i < str.length(); i++) {
            len++;
        }
        return len;
    }

    public static String strcat(String str1, String str2) {
        return str1.concat(str2);
    }

    public static String strcpy(String dest, String src) {
        return src;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.println("Length of the string = " + strlen(str));
        System.out.print("Enter another string: ");
        String str2 = input.nextLine();
        System.out.println("Concatenated string = " + strcat(str, str2));
        System.out.println("Copied string = " + strcpy(str2, str));
    }
}
