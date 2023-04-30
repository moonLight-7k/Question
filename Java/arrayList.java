import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        while (scan.hasNext()) {
            int type = scan.nextInt();
            int index = scan.nextInt();

            try {
                if (type == 1) {
                    System.out.println(a[index]);
                } else {
                    int sum = 0;
                    for (int i = 1; i <= index; i++) {
                        sum += a[i];
                    }
                    System.out.println(sum);
                }
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

    }
}
