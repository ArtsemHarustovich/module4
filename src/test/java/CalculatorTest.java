import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.*;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(CalculatorParameterResolver.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {

    @Test
    @Order(1)
    @DisplayName("Test sumLong method")
    public void CalculatorSumLongTest(Calculator calculator) {
        assertEquals(15_000_000, calculator.sumLong(5_000_000, 10_000_000));
    }

    @Test
    @Order(2)
    @DisplayName("Test sumDouble method")
    public void CalculatorSumDoubleTest(Calculator calculator) {
        assertEquals(14.5, calculator.sumDouble(5.32, 9.18));
    }

    @Test
    @Order(3)
    @DisplayName("Test subLong method")
    public void CalculatorSubLongTest(Calculator calculator) {
        assertEquals(-5, calculator.subLong(5L, 10L));
    }

    @Test
    @Order(4)
    @DisplayName("Test subDouble method")
    public void CalculatorSubDoubleTest(Calculator calculator) {
        assertEquals(-59.99, calculator.subDouble(51.32, 111.31));
    }

    @Test
    @Order(5)
    @DisplayName("Test multLong method")
    public void CalculatorMultLongTest(Calculator calculator) {
        assertEquals(300, calculator.multLong(30, 10));
    }

    @Test
    @Order(6)
    @DisplayName("Test multDouble method")
    public void CalculatorMultDoubleTest(Calculator calculator) {
        assertEquals(2.64, calculator.multDouble(1.2, 2.2));
    }

    @Test
    @Order(7)
    @DisplayName("Test divLong method")
    public void CalculatorDivLongTest(Calculator calculator) {
        assertEquals(3, calculator.divLong(30, 10));
    }

    @Test
    @Order(8)
    @DisplayName("Test divLong by zero method")
    public void CalculatorDivLongByZeroTest(Calculator calculator) {
        assertThrows(ArithmeticException.class, () -> calculator.divLong(30, 0));
    }

    @Test
    @Order(9)
    @DisplayName("Test divDouble method")
    public void CalculatorDivDoubleTest(Calculator calculator) {
        assertEquals(1.1428571428571428, calculator.divDouble(2.4, 2.1));
    }

    @Test
    @Order(10)
    @DisplayName("Test divDouble by zero method")
    public void CalculatorDivDoubleByZeroTest(Calculator calculator) {
        assertThrows(ArithmeticException.class, () -> calculator.divDouble(3.1, 0));
    }

    @Test
    @Order(11)
    @DisplayName("Test pow method")
    public void CalculatorPowTest(Calculator calculator) {
        assertEquals(32, calculator.pow(2.0, 5));
    }

    @Test
    @Order(12)
    @DisplayName("Test sqrt method")
    public void CalculatorSqrtTest(Calculator calculator) {
        assertEquals(4, calculator.sqrt(16));
    }

    @Test
    @Order(13)
    @DisplayName("Test sqrt method with negative value")
    public void CalculatorSqrtNegativeTest(Calculator calculator) {
        assertThrows(ArithmeticException.class, () -> calculator.sqrt(-16));
    }

    @Test
    @Order(14)
    @DisplayName("Test cos method")
    public void CalculatorCosTest(Calculator calculator) {
        assertEquals(1, calculator.cos(0.0));
    }

    @Test
    @Order(15)
    @DisplayName("Test sin method")
    public void CalculatorSinTest(Calculator calculator) {
        assertEquals(0.8939966636005579, calculator.sin(90.0));
    }

    @Test
    @Order(16)
    @DisplayName("Test tg method")
    public void CalculatorTgTest(Calculator calculator) {
        assertEquals(1.6197751905438615, calculator.tg(45.0));
    }

    @Test
    @Order(17)
    @DisplayName("Test ctg method")
    public void CalculatorCtgTest(Calculator calculator) {
        assertEquals(0.6173696237835551, calculator.ctg(45.0));
    }

    @Test
    @Order(18)
    @DisplayName("Test isPositive method: positive value")
    public void CalculatorIsPositiveTrueTest(Calculator calculator) {
        assertTrue(calculator.isPositive(45));
    }

    @Test
    @Order(19)
    @DisplayName("Test isPositive method: negative value")
    public void CalculatorIsPositiveFalseTest(Calculator calculator) {
        assertFalse(calculator.isPositive(-45));
    }

    @Test
    @Order(20)
    @DisplayName("Test isNegative method: negative value")
    public void CalculatorIsNegativeTrueTest(Calculator calculator) {
        assertTrue(calculator.isNegative(-1));
    }

    @Test
    @Order(21)
    @DisplayName("Test isNegative method: positive value")
    public void CalculatorIsNegativeFalseTest(Calculator calculator) {
        assertFalse(calculator.isNegative(1));
    }
}
