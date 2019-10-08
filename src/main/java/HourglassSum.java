public class HourglassSum {

    public static int hourglassSum(int[][] arr) {

        int curr = -9999;
        for (int y = 0; y< 4; y++) {
            for (int x = 0; x < 4; x++) {
                int sum =
                        arr[y][x] + arr[y][x + 1] + arr[y][x + 2]
                                            + arr[y + 1][x + 1] +
                        arr[y + 2][x] + arr[y + 2][x + 1] + arr[y + 2][x + 2];
                if (sum > curr) curr = sum;
            }
        }
        return curr;
    }
}
