import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(CalculatorParameterResolver.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorMultTest {

    @BeforeAll
    public static void prepTestBeforeAll() {
        System.out.println("Calculator mult tests are started!");
    }

    @Test
    @Order(1)
    @DisplayName("Test multLong method")
    public void testCalculatorMultLong(Calculator calculator) {
        assertEquals(300, calculator.multLong(30, 10));
    }

    @Test
    @Order(2)
    @DisplayName("Test multDouble method")
    public void testCalculatorMultDouble(Calculator calculator) {
        assertEquals(2.64, calculator.multDouble(1.2, 2.2));
    }

    @AfterAll
    public static void testAfterAll() {
        System.out.println("Calculator mult tests are finished!");
    }
}
