import java.util.Scanner;

public class arraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of the array elements = " + sum);
    }
}
