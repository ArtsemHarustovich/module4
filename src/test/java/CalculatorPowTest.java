import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(CalculatorParameterResolver.class)
public class CalculatorPowTest {

    @BeforeAll
    public static void prepTestBeforeAll() {
        System.out.println("Calculator pow tests are started!");
    }

    @Test
    @DisplayName("Test pow method")
    public void testCalculatorPow(Calculator calculator) {
        assertEquals(32, calculator.pow(2.0, 5));
    }

    @AfterAll
    public static void testAfterAll() {
        System.out.println("Calculator pow tests are finished!");
    }
}
