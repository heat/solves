public class CtciBubbleSort {

    static int countSwapsN(int[] a) {



        int c = 0;
        for (int i = 0; i <= a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                int v = a[j];
                int n = a[j + 1];
                if (v > n) {
                    a[j] = n;
                    a[j + 1] = v;
                    c++;
                }
            }
        }
        return c;
    }
}
