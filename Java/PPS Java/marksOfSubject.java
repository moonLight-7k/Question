import java.util.Scanner;

public class marksOfSubject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] marks = new int[5];
        int totalMarks = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scan.nextInt();
            totalMarks += marks[i];
        }

        double percentage = (double) totalMarks / (marks.length * 100) * 100;

        System.out.println("Total marks obtained: " + totalMarks);
        System.out.println("Percentage marks obtained: " + percentage + "%");
    }
}
