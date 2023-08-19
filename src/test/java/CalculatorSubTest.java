import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(CalculatorParameterResolver.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorSubTest {

    @BeforeAll
    public static void prepTestBeforeAll() {
        System.out.println("Calculator sub tests are started!");
    }

    @Test
    @Order(1)
    @DisplayName("Test subLong method")
    public void testCalculatorSubLong(Calculator calculator) {
        assertEquals(-5, calculator.subLong(5L, 10L));
    }

    @Test
    @Order(2)
    @DisplayName("Test subDouble method")
    public void testCalculatorSubDouble(Calculator calculator) {
        assertEquals(-59.99, calculator.subDouble(51.32, 111.31));
    }

    @AfterAll
    public static void testAfterAll() {
        System.out.println("Calculator sub tests are finished!");
    }
}
