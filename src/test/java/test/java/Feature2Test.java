package test.java;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import main.java.Feature2;

/**
 * Unit tests for the Feature2 class.
 */
public class Feature2Test {

    /**
     * Tests the getCamps method to ensure it returns the correct camp names.
     */
    @Test
    public void testGetCamps() {
        Feature2 feature = new Feature2();
        String[] expectedCamps = { "North Camp", "South Camp", "East Camp", "West Camp" };
        String[] actualCamps = feature.getCamps();
        assertArrayEquals(expectedCamps, actualCamps);
    }
}
