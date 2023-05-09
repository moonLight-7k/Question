import java.util.Scanner;

public class DiagonalSum {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of rows: ");
      int rows = input.nextInt();
      System.out.print("Enter the number of columns: ");
      int cols = input.nextInt();
      int[][] matrix = new int[rows][cols];
      System.out.println("Enter the elements of the matrix:");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            matrix[i][j] = input.nextInt();
         }
      }
      int sum = 0;
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            if (i == j) {
               sum += matrix[i][j];
            }
         }
      }
      System.out.println("Sum of diagonal elements = " + sum);
   }
}
