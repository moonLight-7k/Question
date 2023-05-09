import java.util.Scanner;

public class simpAndCompIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the Time period (in yrs): ");
        double time = sc.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
