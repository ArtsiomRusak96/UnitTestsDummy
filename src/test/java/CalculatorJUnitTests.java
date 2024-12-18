import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorJUnitTests {

    @Test
    public void addingTest() {
        Calculator calculator = new Calculator();
        assertEquals("The sum of 'x' and 'y' should be:", 14, calculator.add(9, 5));
    }

    @Test
    public void subtractionTest() {
        Calculator calculator = new Calculator();
        assertEquals("The subtraction of 'y' from 'x' should be:", 8, calculator.subtract(12, 4));
    }

    @Test
    public void multiplicationTest() {
        Calculator calculator = new Calculator();
        assertEquals("The multiplication of 'x' and 'y' should be:", 56, calculator.multiply(7, 8));
    }

    @Test
    public void divisionTest() {
        Calculator calculator = new Calculator();
        assertEquals("The division of 'x' by 'y' should be:", 5, calculator.divide(10, 2));
    }

    @Test (expected = ArithmeticException.class)
    public void divisionByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(1, 0);
    }
}
