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


}
