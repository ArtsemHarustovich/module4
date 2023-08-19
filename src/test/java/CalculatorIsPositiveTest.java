import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(CalculatorParameterResolver.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorIsPositiveTest {

    @BeforeAll
    public static void prepTestBeforeAll() {
        System.out.println("Calculator isPositive tests are started!");
    }

    @Test
    @Order(1)
    @DisplayName("Test isPositive method: positive value")
    public void testCalculatorIsPositiveTrue(Calculator calculator) {
        assertTrue(calculator.isPositive(45));
    }

    @Test
    @Order(2)
    @DisplayName("Test isPositive method: negative value")
    public void testCalculatorIsPositiveFalse(Calculator calculator) {
        assertFalse(calculator.isPositive(-45));
    }

    @AfterAll
    public static void testAfterAll() {
        System.out.println("Calculator isPositive tests are finished!");
    }
}
