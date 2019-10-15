
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumBribesTest {

    @Test
    public void testCase0() {


        int[] q = new int[]{ 2, 1, 5, 3, 4 };
        int actual = MinimumBribes.minimumBribes(q);

        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {


        int[] q = new int[]{ 5, 1, 2, 3, 7, 8, 6, 4 };
        int actual = MinimumBribes.minimumBribes(q);

        int expected = -1;

        assertEquals(expected, actual);
    }

    @Test
    public void testCase3() {


        int[] q = new int[]{ 1, 2, 5, 3, 7, 8, 6, 4 };
        int actual = MinimumBribes.minimumBribes(q);

        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void testCase1() {


        int[] q = new int[]{ 2, 5, 1, 3, 4 };
        int actual = MinimumBribes.minimumBribes(q);

        int expected = -1;

        assertEquals(expected, actual);
    }
    @Test
    public void testCase4() {


        int[] q = new int[]{ 1, 2, 5, 3, 7, 8, 6, 4 };
        int actual = MinimumBribes.minimumBribes(q);

        int expected = 7;

        assertEquals(expected, actual);
    }
}
