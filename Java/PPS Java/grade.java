import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of five subjects: ");

        int totalMarks = 500;
        int obtainedMarks = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            obtainedMarks += sc.nextInt();
        }

        double percentage = (double) obtainedMarks / totalMarks * 100;

        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90 && percentage <= 100) {
            System.out.println("Grade: A");
        } else if (percentage >= 80 && percentage < 90) {
            System.out.println("Grade: B");
        } else if (percentage >= 60 && percentage < 80) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }
}
