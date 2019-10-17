import java.util.*;

public class StringsMakingAnagrams {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {


        byte[] sortedA = a.getBytes();
        Arrays.sort(sortedA);
        byte[] sortedB = b.getBytes();
        Arrays.sort(sortedB);

        int count = 0;

        int i = 0, p = 0;
        int maxa = sortedA.length - 1;
        int maxb = sortedB.length - 1;

        while(i < sortedA.length && p < sortedB.length) {

            byte v = sortedA[i];
            byte d = sortedB[p];

            if (v == d) {
                p++;
                i++;
            } else if (v > d) {
                count++;
                p++;
            } else if (d > v) {
                count++;
                i++;
            }
        }

        count += sortedA.length - i;
        count += sortedB.length - p;
        return count;
    }

}
