import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class FraudulentActivityNotificationsTest {


    @Test
    public void testCase1() {

        long expected = 2;
        int d = 5;
        int[] expenditure = new int[]{2, 3, 4, 2, 3, 6, 8, 4, 5};
        long actual = FraudulentActivityNotifications.activityNotifications(expenditure, d);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {

        long expected = 0;
        int d = 4;
        int[] expenditure = new int[]{1, 2, 3, 4, 4};
        long actual = FraudulentActivityNotifications.activityNotifications(expenditure, d);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase3() {

        long expected = 1;
        int d = 3;
        int[] expenditure = new int[]{10, 20, 30, 40, 50};
        long actual = FraudulentActivityNotifications.activityNotifications(expenditure, d);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase4() throws IOException {

        long expected = 492;
        int d = 30000;
        BufferedReader rb = Files.newBufferedReader(Paths.get("C:\\Users\\kb5w\\Downloads\\lemure\\solves\\src\\test\\java\\testecase4.txt"));
        List<Integer> list = rb.lines().map(l -> Integer.parseInt(l)).collect(Collectors.toList());

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        long actual = FraudulentActivityNotifications.activityNotifications( arr, d);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase5() {
        long expected = 1;
        int d = 8;
        int[] expenditure = new int[]{ 1, 3, 4, 6, 7, 9, 11, 15, 5, 7, 30};
        long actual = FraudulentActivityNotifications.activityNotifications(expenditure, d);
        assertEquals(expected, actual);
    }
}
