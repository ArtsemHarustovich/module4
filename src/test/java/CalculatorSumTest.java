import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(CalculatorParameterResolver.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorSumTest {

    @BeforeAll
    public static void prepTestBeforeAll() {
        System.out.println("Calculator sum tests are started!");
    }

    @ParameterizedTest
    @CsvSource({"10, 20, 30", "333, 1, 334", "234322, 8987787865, 8988022187"})
    @Order(1)
    @DisplayName("Test sumLong method: Parameterized")
    public void testCalculatorSumLong(long a, long b, long result, Calculator calculator) {
        assertEquals(result, calculator.sumLong(a, b));
    }

    @Test
    @Order(2)
    @DisplayName("Test sumDouble method")
    public void testCalculatorSumDouble(Calculator calculator) {
        assertEquals(14.5, calculator.sumDouble(5.32, 9.18));
    }

    @AfterAll
    public static void testAfterAll() {
        System.out.println("Calculator sum tests are finished!");
    }
}
