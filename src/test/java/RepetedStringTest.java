import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class RepetedStringTest {


    @Test
    public void divisionTestCase0() {

        long d = 175/100;
        assertEquals(1, d);
    }

    @Test
    public void testCase0() {
        String s = "aba";
        long n = 10;
        long res = RepetedString.repeatedString(s, n);

        int expected = 7;
        assertEquals(expected, res);
    }

    @Test
    public void testCase1() {
        String s = "a";
        long n = 1000000000000l;
        long res = RepetedString.repeatedString(s, n);

        long expected = 1000000000000l;
        assertEquals(expected, res);
    }

}
