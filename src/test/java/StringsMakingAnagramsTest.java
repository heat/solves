import org.junit.Assert;
import org.junit.Test;

public class StringsMakingAnagramsTest {

    @Test(timeout = 1000)
    public void testCase0() {

        String a ="showman";
        String b = "woman";

        int actual = StringsMakingAnagrams.makeAnagram(a, b);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 1000)
    public void testCase1() {

        String a ="cde";
        String b = "abc";

        int actual = StringsMakingAnagrams.makeAnagram(a, b);
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }
}
