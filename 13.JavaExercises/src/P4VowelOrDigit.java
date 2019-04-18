import java.util.Scanner;

public class P4VowelOrDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char symbol = scan.nextLine().charAt(0);

        boolean isDigit = (symbol >= 48 && symbol <= 57);
        boolean isVowel = (symbol == 'a' || symbol == 'A' || symbol == 'o' || symbol == 'O' || symbol == 'e' || symbol == 'E' || symbol == 'i' || symbol == 'I' || symbol == 'u' || symbol == 'U' || symbol == 'y' || symbol == 'Y');

        if (isDigit) {
            System.out.printf("digit");
        } else if (isVowel) {
            System.out.printf("vowel");
        } else {
            System.out.printf("other");
        }
    }
}
