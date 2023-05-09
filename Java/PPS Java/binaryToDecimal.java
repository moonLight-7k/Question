import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Binary to decimal");
        System.out.println("2. Decimal to binary");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter a binary number: ");
                String binaryString = input.next();
                int decimal = Integer.parseInt(binaryString, 2);
                System.out.println("Decimal equivalent = " + decimal);
                break;
            case 2:
                System.out.print("Enter a decimal number: ");
                int decimalNumber = input.nextInt();
                String binary = Integer.toBinaryString(decimalNumber);
                System.out.println("Binary equivalent = " + binary);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
