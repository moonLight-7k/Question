import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int search = input.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == search) {
                System.out.println(search + " found at position " + (i + 1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(search + " not found in the array.");
        }
    }
}
