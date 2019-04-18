import java.util.Arrays;
import java.util.Scanner;

public class P6LargestThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(numbers);

        int count = 1;

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (count > 3) {
                return;
            }

            System.out.println(numbers[i]);
            count++;
        }
    }
}
