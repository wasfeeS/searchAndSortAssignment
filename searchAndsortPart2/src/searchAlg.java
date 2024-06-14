import java.util.ArrayList;
import java.util.Scanner;

public class searchAlg {
    public static void search(ArrayList<Double> data) {
        sortAlg.sortData(data);
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Enter a lap time to search (in seconds): ");
            double searchTime = scanner.nextDouble();
            int index = binarySearch(data, searchTime);
            if (index != -1) {
                System.out.println("Lap time " + searchTime + " seconds found at lap " + (index + 1));
            } else {
                System.out.println("Lap time " + searchTime + " seconds not found.");
            }
            System.out.print("Do you want to search again? (Y/N): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("Y"));
        System.out.print("Have a great day!");
        scanner.close();
    }

    public static int binarySearch(ArrayList<Double> data, double key) {
        int low = 0;
        int high = data.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            double midVal = data.get(mid);

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
