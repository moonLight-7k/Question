import java.util.Scanner;

public class sumOfEvenOddOneToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("Sum of even numbers from 1 to " + n + " is " + sumEven);
        System.out.println("Sum of odd numbers from 1 to " + n + " is " + sumOdd);
    }
}
