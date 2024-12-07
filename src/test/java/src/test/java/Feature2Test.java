package src.test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import src.main.java.Feature2;

public class Feature2Test {

    @Test
    public void testGetCamps() {
        String[] expectedCamps = {"North Camp", "South Camp", "East Camp", "West Camp"};
        Feature2 feature = new Feature2();
        String[] actualCamps = feature.getCamps(); // Assuming getCamps() is implemented
        assertEquals(expectedCamps, actualCamps);
    }
}