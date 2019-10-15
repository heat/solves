import org.junit.Test;
import static org.junit.Assert.*;

public class CtciBubbleSortTest {



    @Test
    public void testCase0() {

        int[] arr = new int[]{ 6, 4, 1 };
        int actual = CtciBubbleSort.countSwapsN(arr);
        int expected = 3;
        assertEquals(expected, actual);
    }
}
