import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(CalculatorParameterResolver.class)
public class CalculatorCtgTest {

    @BeforeAll
    public static void prepTestBeforeAll() {
        System.out.println("Calculator ctg tests are started!");
    }

    @Test
    @DisplayName("Test ctg method")
    public void testCalculatorCtg(Calculator calculator) {
        assertEquals(0.6173696237835551, calculator.ctg(45.0));
    }

    @AfterAll
    public static void testAfterAll() {
        System.out.println("Calculator ctg tests are finished!");
    }
}
