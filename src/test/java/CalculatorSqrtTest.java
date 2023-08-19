import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(CalculatorParameterResolver.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorSqrtTest {

    @BeforeAll
    public static void prepTestBeforeAll() {
        System.out.println("Calculator sqrt tests are started!");
    }

    @Test
    @Order(1)
    @DisplayName("Test sqrt method")
    public void testCalculatorSqrt(Calculator calculator) {
        assertEquals(4, calculator.sqrt(16));
    }

    @Test
    @Order(2)
    @DisplayName("Test sqrt method with negative value")
    public void testCalculatorSqrtNegative(Calculator calculator) {
        assertThrows(ArithmeticException.class, () -> calculator.sqrt(-16));
    }

    @AfterAll
    public static void testAfterAll() {
        System.out.println("Calculator sqrt tests are finished!");
    }
}
