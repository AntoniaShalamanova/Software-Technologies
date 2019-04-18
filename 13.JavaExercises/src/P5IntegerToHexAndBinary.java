import java.util.Scanner;

public class P5IntegerToHexAndBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int decimal = Integer.parseInt(scan.nextLine());

        System.out.println(Integer.toHexString(decimal).toUpperCase());
        System.out.println(Integer.toBinaryString(decimal));
    }
}
