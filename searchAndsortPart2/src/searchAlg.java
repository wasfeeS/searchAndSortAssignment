import java.util.ArrayList;
import java.util.Scanner;

public class searchAlg {
    public static void search(ArrayList<Double> data) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Enter a lap time to search (in seconds): ");
            double searchTime = scanner.nextDouble();
            ArrayList<Integer> duplicates = findAllDuplicates(data, searchTime);
            if (!duplicates.isEmpty()) {
                System.out.print("Lap time " + searchTime + " seconds found at lap(s): ");
                for (int lap : duplicates) {
                    System.out.print(lap + ", ");
                }
                System.out.println();
            } else {
                System.out.println("Lap time " + searchTime + " seconds not found.");
            }
            System.out.print("Do you want to search again? (Y/N): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("Y"));
        System.out.print("Have a great day!");
        scanner.close();
    }

    public static ArrayList<Integer> findAllDuplicates(ArrayList<Double> data, double key) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) == key) {
                duplicates.add(i + 1);
            }
        }
        return duplicates;
    }
}