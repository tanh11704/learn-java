package learn.java.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exercise03Test {
    @Test
    void testPrimeFactorization() {
        // Trường hợp ví dụ
        assertEquals("2 * 2 * 2 * 3 * 5 * 5", Exercise03.primeFactorization(600));

        // Trường hợp số nguyên tố
        assertEquals("29", Exercise03.primeFactorization(29));

        // Trường hợp số là lũy thừa của một số nguyên tố
        assertEquals("2 * 2 * 2 * 2 * 2", Exercise03.primeFactorization(32));

        // Trường hợp số nhỏ
        assertEquals("2 * 3 * 5", Exercise03.primeFactorization(30));

        // Trường hợp biên: số 1, 2, 3
        assertEquals("1", Exercise03.primeFactorization(1));
        assertEquals("2", Exercise03.primeFactorization(2));
        assertEquals("3", Exercise03.primeFactorization(3));

        // Thường thì phân tích thừa số nguyên tố không áp dụng cho số <= 0
        // nên có thể kiểm tra việc ném ra ngoại lệ
        assertThrows(IllegalArgumentException.class, () -> Exercise03.primeFactorization(0));
        assertThrows(IllegalArgumentException.class, () -> Exercise03.primeFactorization(-100));
    }
}
