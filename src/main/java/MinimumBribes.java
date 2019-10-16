public class MinimumBribes {

    /**
     * @param q
     * @return -1 para 'Too chaotic'
     */
    public static int minimumBribesX(int[] q) {

        int r = 0;

        int total = q.length;
        for (int i = 0; i < total; i++) {

            // marcador da posicao
            int pos = q[i];
            // posicao corrente
            int curr = i + 1;
            if (curr >= pos) {
                continue;
            }
            int bribe = pos - curr;
            if (bribe > 2) {
                return -1;
            }
            r += bribe;
        }

        return r;
    }

    public static int minimumBribes(int[] q) {

        int p = 0, c = 0;

        for (int i = 0; i < q.length; i++) {
            int v = q[i] - (i + 1);
            if (v > 2) {
                return -1;
            }
        }

        while (p < q.length) {
            int v = q[p];
            int w = v - (p + 1);
            // ja na posicao
            if (w == 0) {
                p += 1;
                continue;
            }
            // switch
            if (w < 0) {
                int prev = q[p - 1];
                q[p] = prev;
                q[p - 1] = v;
                p = p - 1;
                c++;
                continue;
            }
            p += 1;
        }
        return c;
    }

}
