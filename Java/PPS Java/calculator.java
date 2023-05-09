import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int a, b;
        char op;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two Integers");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Enter an Operator");
        op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.format("%d + %d = %d\n", a, b, a + b);
                break;
            case '-':
                System.out.format("%d - %d = %d\n", a, b, a - b);
                break;
            case '*':
                System.out.format("%d * %d = %d\n", a, b, a * b);
                break;
            case '/':
                System.out.format("%d / %d = %d\n", a, b, a / b);
                break;
            default:
                System.out.println("ERROR: Unsupported Operation");
        }
    }
}