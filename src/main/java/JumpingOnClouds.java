import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JumpingOnClouds {

    static class Game {
        public int curr;
        public int acc;

        public boolean jumped;

        public boolean waiting;

        public int pos;

        public int skiped;

        @Override
        public String toString() {
            return "Game{" +
                    "curr=" + curr +
                    ", acc=" + acc +
                    '}';
        }
    }

    public static int jumpingOnClouds(int... c) {

        int jump = 0;
        int step = 2;
        int fim = (c.length - 2);
        int pos = 0;
        for (pos = 0; pos < fim; pos += step) {
            int ahead = c[pos + step];
            if (ahead == 1) {
                pos--;
            }
            jump++;
        }

        // com o ultimo saltinho
        return jump + (c.length - pos - 1);
    }

    public static int jumpingOnCloudsWhile(int... c) {

        int size = c.length;

        // conta quantidade de 0
        List<Integer> clouds = Arrays.stream(c).boxed().collect(Collectors.toList());


        int jump = 0;

        int next = 1;
        while(next < size) {
            if (c[next] == 1) {
                jump++;
                next += 2;
                continue;
            }
            // verifica se e o penultimo bloco
            if (next == size - 1) {
                jump++;
                next = size;
                continue;
            }

            // verifico se tenho casa para pular
            int ahead = c[next + 1];
            if (ahead == 0) {
                jump++;
                next += 2;
                continue;
            }
            jump++;
            next++;
        }
//        int res = (int) clouds.stream().filter(i -> i.equals(0)).count() - 1;
//
//
//        Game g = clouds.stream().skip(1).reduce(new Game(), (ac, n) -> {
//
//
//            return ac;
//        }, (f, d) -> f);
        return jump;
    }
}
