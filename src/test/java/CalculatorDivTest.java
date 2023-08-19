import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(CalculatorParameterResolver.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorDivTest {

    @BeforeAll
    public static void prepTestBeforeAll() {
        System.out.println("Calculator div tests are started!");
    }

    @Test
    @Order(1)
    @DisplayName("Test divLong method")
    public void testCalculatorDivLong(Calculator calculator) {
        assertEquals(3, calculator.divLong(30, 10));
    }

    @Test
    @Order(2)
    @DisplayName("Test divLong by zero method")
    public void testCalculatorDivLongByZero(Calculator calculator) {
        assertThrows(ArithmeticException.class, () -> calculator.divLong(30, 0));
    }

    @Test
    @Order(3)
    @DisplayName("Test divDouble method")
    public void testCalculatorDivDouble(Calculator calculator) {
        assertEquals(1.1428571428571428, calculator.divDouble(2.4, 2.1));
    }

    @Test
    @Order(4)
    @DisplayName("Test divDouble by zero method")
    public void testCalculatorDivDoubleByZero(Calculator calculator) {
        assertThrows(ArithmeticException.class, () -> calculator.divDouble(3.1, 0));
    }

    @AfterAll
    public static void testAfterAll() {
        System.out.println("Calculator div tests are finished!");
    }
}
