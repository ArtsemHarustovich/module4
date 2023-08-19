import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(CalculatorParameterResolver.class)
public class CalculatorCosTest {

    @BeforeAll
    public static void prepTestBeforeAll() {
        System.out.println("Calculator cos tests are started!");
    }

    @Test
    @DisplayName("Test cos method")
    public void testCalculatorCos(Calculator calculator) {
        assertEquals(1, calculator.cos(0.0));
    }

    @AfterAll
    public static void testAfterAll() {
        System.out.println("Calculator cos tests are finished!");
    }
}
