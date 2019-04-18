import java.util.Scanner;

public class P2BooleanVariable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String bool = scan.nextLine();

        if (Boolean.valueOf(bool)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
