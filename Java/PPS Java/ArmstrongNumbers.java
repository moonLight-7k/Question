public class ArmstrongNumbers {
    public static void main(String[] args) {
        int num, originalNum, remainder, result;
        System.out.print("Armstrong numbers between 1 and 100: ");
        for (num = 1; num <= 100; num++) {
            result = 0;
            originalNum = num;
            while (originalNum != 0) {
                remainder = originalNum % 10;
                result += Math.pow(remainder, 3);
                originalNum /= 10;
            }
            if (result == num) {
                System.out.print(num + " ");
            }
        }
    }
}
