import java.util.Scanner;

public class P10IndexOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        for (int i = 0; i < word.length(); i++) {
            int indx = word.toCharArray()[i] - 97;
            System.out.printf("%s -> %d%n", word.toCharArray()[i], indx);
        }
    }
}
