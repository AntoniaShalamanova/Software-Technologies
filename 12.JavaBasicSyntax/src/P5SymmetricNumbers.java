import com.sun.glass.ui.SystemClipboard;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P5SymmetricNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        for (int currentNum = 1; currentNum <= number; currentNum++) {
            if (isSymmetric(currentNum)) {
                System.out.printf(" %d", currentNum);
            }
        }
    }

    private static boolean isSymmetric(int currentNum) {
        StringBuilder reversedNum = new StringBuilder();
        reversedNum.append(Integer.toString(currentNum));
        reversedNum = reversedNum.reverse();

        if (Integer.parseInt(reversedNum.toString()) == currentNum) {
            return true;
        } else {
            return false;
        }
    }
}
