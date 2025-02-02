package code.with.vanilson;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
class AppTest {


    @Test
    void testApp() {
        assertTrue(true);
    }

    @Test
    void testApp2() {
        assertThatExceptionOfType(ArithmeticException.class).isThrownBy(() -> {
            App.isUnsuportedOperation(4);
        });
    }
}
