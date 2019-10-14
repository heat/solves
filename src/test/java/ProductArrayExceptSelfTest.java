

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductArrayExceptSelfTest {

    @Test
    public void testCase0() {

        int[] args = new int[]{1,2,3,4};


        int[] actuals = ProductArrayExceptSelf.productArrayExceptSelf(args);
        int[] expected = new int[]{24, 12, 8, 6};

        assertArrayEquals(expected, actuals);
    }
}
