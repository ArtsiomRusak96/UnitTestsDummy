import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class EvenOddCheckerTestNgTests {

    @Test
    public void evenNumbersTest() {
        assertTrue(EvenOddChecker.check(464), "The entered number should be even");
    }

    @Test
    public void oddNumbersTest() {
        assertFalse(EvenOddChecker.check(111), "The entered number should be odd");
    }
}
