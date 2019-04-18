import java.util.Scanner;

public class P1VariableInHexFormat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String hexadecimal = scan.nextLine();

        int decimal = Integer.parseInt(hexadecimal, 16);

        System.out.println(decimal);
    }
}
