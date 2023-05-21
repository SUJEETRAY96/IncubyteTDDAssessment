import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testEmptyString() {
        Calculator calculator = new Calculator();
        int result = calculator.add("");
        Assertions.assertEquals(0, result);
    }
}
