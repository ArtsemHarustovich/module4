import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(CalculatorParameterResolver.class)
public class CalculatorTgTest {

    @BeforeAll
    public static void prepTestBeforeAll() {
        System.out.println("Calculator tg tests are started!");
    }

    @Test
    @DisplayName("Test tg method")
    public void testCalculatorTg(Calculator calculator) {
        assertEquals(1.6197751905438615, calculator.tg(45.0));
    }

    @AfterAll
    public static void testAfterAll() {
        System.out.println("Calculator tg tests are finished!");
    }
}
