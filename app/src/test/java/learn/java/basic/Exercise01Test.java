package learn.java.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise01Test {
    @Test
    void testGcd() {
        // Trường hợp thông thường
        assertEquals(6, Exercise01.gcd(54, 24));
        assertEquals(1, Exercise01.gcd(17, 13));
        assertEquals(7, Exercise01.gcd(7, 21));

        // Trường hợp có số 0
        assertEquals(5, Exercise01.gcd(5, 0));
        assertEquals(5, Exercise01.gcd(0, 5));
        assertEquals(0, Exercise01.gcd(0, 0));

        // Trường hợp hai số bằng nhau
        assertEquals(10, Exercise01.gcd(10, 10));

        // Trường hợp một số là 1
        assertEquals(1, Exercise01.gcd(1, 100));
    }

    @Test
    void testLcm() {
        // Trường hợp thông thường
        assertEquals(36, Exercise01.lcm(12, 18));
        assertEquals(35, Exercise01.lcm(5, 7));

        // Trường hợp một số là bội của số kia
        assertEquals(20, Exercise01.lcm(4, 20));

        // Trường hợp có số 0 (BSCNN của một số với 0 thường được định nghĩa là 0)
        assertEquals(0, Exercise01.lcm(10, 0));
        assertEquals(0, Exercise01.lcm(0, 10));
        assertEquals(0, Exercise01.lcm(0, 0));

        // Trường hợp một số là 1
        assertEquals(50, Exercise01.lcm(1, 50));
    }
}
