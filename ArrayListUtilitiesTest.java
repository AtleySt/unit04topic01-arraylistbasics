import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ArrayListUtilitiesTest {
    @Test
    public void testGetListMax() {
        ArrayList<Integer> input;
        int expectedOutput;
        int actualOutput;

        // some positive numbers
        input = new ArrayList<>(Arrays.asList(1, 20, 4, 9, 2, 1));
        expectedOutput = 20;
        actualOutput = ArrayListUtilities.getListMax(input);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testWithoutLongWords() {
        ArrayList<String> input;
        ArrayList<String> expectedOutput;
        ArrayList<String> actualOutput;

        input = new ArrayList<String>(Arrays.asList("Cow","AtleyS","Pig","APCompSci","APCSA"));
        expectedOutput = new ArrayList<String>(Arrays.asList("Cow","Pig","APCSA"));
        actualOutput = ArrayListUtilities.withoutLongWords(input);
        assertEquals(expectedOutput, actualOutput);
    }

    // come back, not sure how to test void methods
    @Test
    public void testRemoveLongWords() {
        ArrayList<String> input;
        ArrayList<String> expectedOutput;
        ArrayList<String> actualOutput;

        input = new ArrayList<String>(Arrays.asList("Cow","AtleyS","Pig","APCompSci","APCSA"));
        expectedOutput = new ArrayList<String>(Arrays.asList("Cow","Pig", "APCSA"));
        ArrayListUtilities.removeLongWords(input);
        actualOutput = input;
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testReversed() {
        ArrayList<Double> input;
        ArrayList<Double> expectedOutput;
        ArrayList<Double> actualOutput;

        input = new ArrayList<Double>(Arrays.asList(2.2,3.3,4.4,5.5,6.6));
        expectedOutput = new ArrayList<Double>(Arrays.asList(6.6,5.5,4.4,3.3,2.2));
        actualOutput = ArrayListUtilities.reversed(input);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testReverseInPlace() {
        ArrayList<Double> input;
        ArrayList<Double> expectedOutput;
        ArrayList<Double> actualOutput;

        input = new ArrayList<Double>(Arrays.asList(2.2,3.3,4.4,5.5,6.6));
        expectedOutput = new ArrayList<Double>(Arrays.asList(6.6,5.5,4.4,3.3,2.2));
        ArrayListUtilities.reverseInPlace(input);
        actualOutput = input;
        assertEquals(expectedOutput, actualOutput);
    }
}
