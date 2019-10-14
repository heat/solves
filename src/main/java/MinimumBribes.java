public class MinimumBribes {

    /**
     *
     * @param q
     * @return -1 para 'Too chaotic'
     */
    public static int minimumBribes(int[] q) {

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
}
