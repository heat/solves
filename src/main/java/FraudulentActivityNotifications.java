import java.util.*;

public class FraudulentActivityNotifications {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {

        int start = 0,
                end = d,
                p = d,
                med = d / 2,
                acc = 0;
        int count = 0;

        boolean odd = d % 2 == 1;

        int[] sortedex = new int[d];
        for (int i = 0; i < d; i++) {
            sortedex[i] = expenditure[i];
        }

        Arrays.sort(sortedex);

        double actmed = 0;
        for (int i = p; i < expenditure.length; i++) {

            if (odd) {
                actmed = sortedex[med];
            } else {
                actmed = (sortedex[med - 1] + sortedex[med ]) / 2.0;
            }
            int actval = expenditure[i];
            if (actval >= actmed * 2) {
                count++;
            }
            add(sortedex, actval, expenditure[i - p]);
        }
        return count;
    }

    private static void add(int[] sortedex, int val, int repl) {

        boolean skip = true;
        // remove o elemento
        for (int i = 0; i < sortedex.length; i++) {

            int v = sortedex[i];
            if (repl == v) {
                skip = false;
                continue;
            }
            if (skip) continue;
            sortedex[i - 1] = sortedex[i];
        }
        sortedex[sortedex.length - 1] = val;
        for (int i = sortedex.length - 1; i > 0; i--) {
            int curr = sortedex[i];
            int prev = sortedex[i - 1];
            if (curr < prev) {
                sortedex[i - 1] = curr;
                sortedex[i] = prev;
                continue;
            }
            break;
        }
    }
}
