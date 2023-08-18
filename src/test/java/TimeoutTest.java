import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class TimeoutTest {
    static Timeout timeout;

    @BeforeAll
    public static void prepTestBeforeAll() {
        System.out.println("Timeout tests are started!");
    }

    @BeforeEach
    public void prepTestBeforeEach() {
        timeout = new Timeout();
    }

    @Test
    public void testTimeout() {
        assertTimeout(Duration.ofSeconds(10), () -> timeout.sleep(5));
    }

    @AfterAll
    public static void testAfterAll() {
        System.out.println("Timeout tests are finished!");
    }
}
