import java.util.Arrays;
import java.util.Scanner;

public class P11EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int leftSum = 0;
        int rightSum = 0;

        int totalSum = Arrays.stream(numbers).sum();

        for (int indx = 0; indx < numbers.length; indx++) {
            leftSum = Arrays.stream(Arrays.copyOfRange(numbers, 0, indx)).sum();
            rightSum = totalSum - leftSum - numbers[indx];

            if (leftSum == rightSum){
                System.out.println(indx);
                return;
            }
        }

        System.out.println("no");
    }
}
