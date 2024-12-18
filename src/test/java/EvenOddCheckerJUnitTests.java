import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvenOddCheckerJUnitTests {

    @Test
    public void evenNumbersTest() {
        assertTrue("'TRUE' is expected for even numbers", EvenOddChecker.check(2));
    }

    @Test
    public void oddNumbersTest() {
        assertFalse("'FALSE' is expected for odd numbers", EvenOddChecker.check(3));
    }
}

