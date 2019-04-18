import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P6CompareCharArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] firstArr = scan
                .nextLine()
                .replace(" ", "")
                .toCharArray();

        char[] secondArr = scan
                .nextLine()
                .replace(" ", "")
                .toCharArray();


        if (firstArr.length < secondArr.length) {
            System.out.println(firstArr);
            System.out.println(secondArr);
        } else if (firstArr.length > secondArr.length) {
            System.out.println(secondArr);
            System.out.println(firstArr);
        } else {
            System.out.println(compare(firstArr, secondArr));
        }
    }

    private static String compare(char[] firstArr, char[] secondArr) {
        String result = String.format("%s%n%s", String.valueOf(firstArr), String.valueOf(secondArr));

        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] < secondArr[i]) {
                return result;
            } else {
                result = result = String.format("%s%n%s", String.valueOf(secondArr), String.valueOf(firstArr));
                return result;
            }
        }

        return result;
    }
}
