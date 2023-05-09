import java.util.Scanner;

public class sumOfArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int size = input.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int[] sum = new int[size];
        System.out.print("Enter the elements of the first array: ");
        for (int i = 0; i < size; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.print("Enter the elements of the second array: ");
        for (int i = 0; i < size; i++) {
            arr2[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {
            sum[i] = arr1[i] + arr2[i];
        }
        System.out.print("Sum of corresponding elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(sum[i] + " ");
        }
    }
}
