import java.util.Arrays;
import java.util.Scanner;

public class P9MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxCount = 0;
        int maxFrequentNumber = numbers[0];

        for (int numb = 0; numb < numbers.length; numb++) {
            int currentCount = 1;

            for (int currentNumb = numb; currentNumb < numbers.length; currentNumb++) {
                if (numbers[numb] == numbers[currentNumb]) {
                    currentCount++;
                }
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxFrequentNumber = numbers[numb];
            }
        }

        System.out.println(maxFrequentNumber);
    }
}
