import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class TimeoutTest {
    Timeout timeout = new Timeout();

    @Test
    public void timeoutTest() {
        assertTimeout(Duration.ofSeconds(10), () -> timeout.sleep(5));
    }
}
