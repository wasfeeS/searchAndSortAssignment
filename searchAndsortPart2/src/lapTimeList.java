import java.util.ArrayList;
import java.util.Scanner;

public class lapTimeList {
    private ArrayList<Double> data = new ArrayList<>();
    private Scanner scanner;

    public void collectData() {
        scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Enter lap time for the lap (in seconds) (or 'done'/'exit' to finish): ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("done") || input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                double lapTime = Double.parseDouble(input);
                data.add(lapTime);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid lap time or 'done'/'exit' to finish.");
            }
            System.out.print("Continue entering data? (Y/N): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("Y"));
    }

    public ArrayList<Double> getData() {
        return data;
    }

    public void closeScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
}