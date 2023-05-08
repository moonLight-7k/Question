import java.util.Scanner;

class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] mat = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = scan.nextInt();
            }

        }
        int sum = 0;
        int n = mat.length;

        for (int k = 0; k < n; k++) {
            if (k != n - k - 1) {
                sum += mat[k][k] + mat[k][n - k - 1];
            } else {
                sum += mat[k][k];
            }
        }

    }

}