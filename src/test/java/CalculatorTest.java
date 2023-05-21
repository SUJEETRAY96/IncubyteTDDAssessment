import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testEmptyString() {
        Calculator calculator = new Calculator();
        int result = calculator.add("");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testSingleNumberString() {
        Calculator calculator = new Calculator();
        int result = calculator.add("5");
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testTwoNumbersString() {
        Calculator calculator = new Calculator();
        int result = calculator.add("7,6");
        Assertions.assertEquals(13, result);
    }

    @Test
    public void testMultipleNumbersString() {
        Calculator calculator = new Calculator();
        int result = calculator.add("20,7,3");
        Assertions.assertEquals(30, result);
    }

    @Test
    public void testNewLineDelimiter() {
        Calculator calculator = new Calculator();
        int result = calculator.add("1\n2,3");
        Assertions.assertEquals(6, result);
    }
    @Test
    public void testCustomDelimiter() {
        Calculator calculator = new Calculator();
        int result = calculator.add("//;\n1;2");
        Assertions.assertEquals(3, result);
    }
    @Test
    public void testNegativeNumberException() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calculator.add("-6"),
                "Negatives not allowed: -6"
        );
    }
    @Test
    public void testMultipleNegativeNumberException() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calculator.add("1,-2,3,-4"),
                "Negatives not allowed: -2 -4"
        );
    }


}
