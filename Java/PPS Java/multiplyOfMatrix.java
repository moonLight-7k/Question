import java.util.Scanner;

public class multiplyOfMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the order of the matrices: ");
        int n = input.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] sum = new int[n][n];
        int[][] product = new int[n][n];
        System.out.println("Enter the elements of matrix A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                product[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Sum of matrices:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Product of matrices:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
