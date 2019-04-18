import java.util.Scanner;
import java.util.TreeMap;

public class P7SumsByTown {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String, Double> sumsByTown = new TreeMap<>();
        int townsCount = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < townsCount; i++) {
            String[] input = scan.nextLine().split("\\|");
            String townName = input[0].trim();
            double income = Double.parseDouble(input[1].trim());

            if (sumsByTown.containsKey(townName)) {
                sumsByTown.put(townName, sumsByTown.get(townName) + income);

            } else {
                sumsByTown.put(townName, income);
            }
        }

        for (String key : sumsByTown.keySet()) {
            System.out.println(key + " -> " + sumsByTown.get(key));
        }
    }
}
