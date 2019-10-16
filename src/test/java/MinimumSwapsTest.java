import org.junit.Test;
import static org.junit.Assert.*;

public class MinimumSwapsTest {


    @Test
    public void testCase0() {
        int[] arr = new int[]{1, 3, 5, 2, 4, 6, 7 };

        int actual = MinimumSwaps.minimumSwaps(arr);
        int expected = 3;
        assertEquals(expected, actual);
    }
}
