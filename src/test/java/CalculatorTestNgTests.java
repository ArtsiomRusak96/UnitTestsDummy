import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTestNgTests {

    @Test
    public void addingTest() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.add(11, 12), 23, "The sum of 'x' and 'y' should be:");
    }

    @Test
    public void subtractionTest() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.subtract(7, 13), -6, "The subtraction of 'y' from 'x' should be:");
    }

    @Test
    public void multiplicationTest() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.multiply(-5, 5), -25, "The multiplication of 'x' and 'y' should be:");
    }

    @Test
    public void divisionTest() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.divide(130, 26), 5, "The division of 'x' by 'y' should be:");
    }

    @Test (expectedExceptions = ArithmeticException.class)
    public void divisionByZeroTest() {
        Calculator calculator = new Calculator();
        calculator.divide(12345, 0);
    }
}
