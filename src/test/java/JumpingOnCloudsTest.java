import org.junit.Test;
import static org.junit.Assert.*;

public class JumpingOnCloudsTest {


    @Test
    public void testCase0() {

        int[] d = new int[]{0, 0, 1, 0, 0, 1, 0};

        int res = JumpingOnClouds.jumpingOnClouds(d);

        int expected = 4;

        assertEquals(expected, res);
    }

    @Test
    public void testCase1() {

        int[] d = new int[]{0, 0, 0, 0, 1, 0};

        int res = JumpingOnClouds.jumpingOnClouds(d);

        int expected = 3;

        assertEquals(expected, res);
    }

    @Test
    public void testCase2() {

        int[] d = new int[]{0, 1, 0, 0, 0, 1, 0, 0, 0};

        int res = JumpingOnClouds.jumpingOnClouds(d);

        int expected = 4;

        assertEquals(expected, res);
    }

    @Test
    public void testCase3() {

        int[] d = new int[]{0, 0, 0, 1, 0, 0};

        int res = JumpingOnClouds.jumpingOnClouds(d);

        int expected = 3;

        assertEquals(expected, res);
    }
}
