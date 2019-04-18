import java.util.Arrays;
import java.util.Scanner;

public class P3ThreeIntegersSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int num1 = numbers[0];
        int num2 = numbers[1];
        int num3 = numbers[2];

        if (!checkThreeIntegers(num1, num2, num3) &&
                !checkThreeIntegers(num3, num1, num2) &&
                !checkThreeIntegers(num2, num3, num1))
            System.out.println("No");
    }

    private static boolean checkThreeIntegers(int num1, int num2, int sum) {
        if (num1 + num2 != sum) {
            return false;
        }

        if (num1 <= num2) {
            System.out.printf("%d + %d = %d%n", num1, num2, sum);
        } else {
            System.out.printf("%d + %d = %d%n", num2, num1, sum);
        }

        return true;
    }
}
