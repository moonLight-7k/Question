import java.util.Scanner;

public class circumfrenceOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;

        double circumfer = 2 * Math.PI * radius;

        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumfer);
    }
}
