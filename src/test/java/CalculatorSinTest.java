import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(CalculatorParameterResolver.class)
public class CalculatorSinTest {

    @BeforeAll
    public static void prepTestBeforeAll() {
        System.out.println("Calculator sin tests are started!");
    }

    @Test
    @DisplayName("Test sin method")
    public void testCalculatorSin(Calculator calculator) {
        assertEquals(0.8939966636005579, calculator.sin(90.0));
    }

    @AfterAll
    public static void testAfterAll() {
        System.out.println("Calculator sin tests are finished!");
    }
}
