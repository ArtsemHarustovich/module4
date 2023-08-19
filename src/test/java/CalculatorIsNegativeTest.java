import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(CalculatorParameterResolver.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorIsNegativeTest {

    @BeforeAll
    public static void prepTestBeforeAll() {
        System.out.println("Calculator isNegative tests are started!");
    }

    @Test
    @Order(1)
    @DisplayName("Test isNegative method: negative value")
    public void testCalculatorIsNegativeTrue(Calculator calculator) {
        assertTrue(calculator.isNegative(-1));
    }

    @Test
    @Order(2)
    @DisplayName("Test isNegative method: positive value")
    public void testCalculatorIsNegativeFalse(Calculator calculator) {
        assertFalse(calculator.isNegative(1));
    }

    @AfterAll
    public static void testAfterAll() {
        System.out.println("Calculator isNegative tests are finished!");
    }
}
