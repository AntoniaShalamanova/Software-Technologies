import java.util.Arrays;
import java.util.Scanner;

public class P7MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int lastNum = numbers[0];
        String currentSequence = String.valueOf(lastNum) + " ";
        String maxSequence = "";

        for (int i = 1; i < numbers.length; i++) {
            int currentNum = numbers[i];

            if (lastNum == currentNum) {
                currentSequence += String.valueOf(currentNum) + " ";
            } else {
                if (currentSequence.length() > maxSequence.length()) {
                    maxSequence = currentSequence;
                }
                currentSequence = String.valueOf(currentNum) + " ";
            }

            lastNum = currentNum;
        }

        if (currentSequence.length() > maxSequence.length()) {
            maxSequence = currentSequence;
        }

        System.out.println(maxSequence);
    }
}
