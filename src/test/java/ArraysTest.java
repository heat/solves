import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraysTest {

    @Test
    public void testCase0() {
        int[] arr = new int[]{9,3,15,20,7};

        int actual = Arrays.binarySearch(arr, 3);
        int expected = 1;

        assertEquals(expected, actual);
    }
}
