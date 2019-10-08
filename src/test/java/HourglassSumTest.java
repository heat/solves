import org.junit.Test;
import static org.junit.Assert.*;
public class HourglassSumTest {

    @Test
    public void testCase0() {

        int[][] arr = new int[][]{
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0}
        };

        int actual = HourglassSum.hourglassSum(arr);
        int expected = 19;
        assertEquals(expected, actual);
    }
}
