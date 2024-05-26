import java.util.ArrayList;

public class sortAlg {
    public static void sortData(ArrayList<Double> data) {
        mergeSort(data, 0, data.size() - 1);
        System.out.println("Lap times sorted successfully.");
    }

    private static void mergeSort(ArrayList<Double> data, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(data, left, mid);
            mergeSort(data, mid + 1, right);

            merge(data, left, mid, right);
        }
    }

    private static void merge(ArrayList<Double> data, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        ArrayList<Double> L = new ArrayList<>();
        ArrayList<Double> R = new ArrayList<>();

        for (int i = 0; i < n1; ++i)
            L.add(data.get(left + i));
        for (int j = 0; j < n2; ++j)
            R.add(data.get(mid + 1 + j));

        int i = 0, j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            if (L.get(i) <= R.get(j)) {
                data.set(k, L.get(i));
                i++;
            } else {
                data.set(k, R.get(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            data.set(k, L.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            data.set(k, R.get(j));
            j++;
            k++;
        }
    }
}