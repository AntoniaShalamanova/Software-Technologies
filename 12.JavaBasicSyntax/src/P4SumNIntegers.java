import java.util.Scanner;

public class P4SumNIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(scan.nextLine());
            sum += number;
        }

        System.out.printf("Sum = %d", sum);
    }
}
