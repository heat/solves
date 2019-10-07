import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RepetedString {

    static long repeatedString(String s, long n) {

        long size = s.length();
        long step = s.chars().filter(y -> y == 'a').count();
        long partes =n / size;
        long totala = partes * step;

        // restante
        long res = n - (partes * size);
        totala += s.substring(0, (int) res).chars().filter(y -> y == 'a').count();
        return totala;
    }
    // Complete the repeatedString function below.
    static long repeatedStringAcc(String s, long n) {

        long c, start_c;

        c = start_c = s.length();
        long size, start_size;
        size = start_size = c;
        long totala = 0;

        long step, start_step;
        step = start_step = s.chars().filter(y -> y == 'a').count();

//        StringBuilder sb = new StringBuilder(s);

        long v = 0;
        while(size <= n) {

            if (size + c > n) {
                c = start_c;
                step =start_step;
            }
            totala += step;
            size += c;
            c += c;
            step += step;
        }

        // busca algum residual
        long r = size - n;
        if (r > 0 && r < start_c) {
            totala += s.substring(0, (int) r).chars().filter(y -> y == 'a').count();
        }
        return totala;
    }
}
