import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P12BombNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int[] tokens = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int bombNumber = tokens[0];
        int power = tokens[1];

        int beginIndx = 0;
        int endIndx = 0;

        for (int indx = 0; indx < numbers.size(); indx++) {

            if (numbers.get(indx) == bombNumber) {
                beginIndx = indx - power;
                endIndx = indx + power;

                if (beginIndx < 0) {
                    beginIndx = 0;
                }

                if (endIndx >= numbers.size()) {
                    endIndx = numbers.size() - 1;
                }

                numbers.subList(beginIndx, endIndx + 1).clear();
                indx = 0;
            }
        }

        int sum = 0;
        for (int numb : numbers) {
            sum += numb;
        }

        System.out.println(sum);
    }

}
