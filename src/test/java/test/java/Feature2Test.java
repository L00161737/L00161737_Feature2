package test.java;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import main.java.Feature2;

/**
 * Test class for the Feature2 functionality.
 */
public class Feature2Test {

    /**
     * Tests the getCamps() method to ensure it returns the correct list of camps.
     */
    @Test
    public void testGetCamps() {
        // Expected output
        String[] expectedCamps = {"North Camp", "South Camp", "East Camp", "West Camp"};

        // Create an instance of Feature2 and get the actual output
        Feature2 feature = new Feature2();
        String[] actualCamps = feature.getCamps();

        // Verify the output
        assertArrayEquals(expectedCamps, actualCamps);
    }
}
