package learn.java.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exercise05Test {
    @Test
    void testFactorial() {
        // Trường hợp thông thường
        assertEquals(1, Exercise05.factorial(0));
        assertEquals(1, Exercise05.factorial(1));
        assertEquals(2, Exercise05.factorial(2));
        assertEquals(120, Exercise05.factorial(5));
        assertEquals(3628800, Exercise05.factorial(10));

        // Trường hợp số âm, ném ra ngoại lệ
        assertThrows(IllegalArgumentException.class, () -> {
            Exercise05.factorial(-1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Exercise05.factorial(-10);
        });
    }
}
