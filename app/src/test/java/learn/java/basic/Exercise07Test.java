package learn.java.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise07Test {
    @Test
    void testReverseBinary() {
        // Trường hợp ví dụ: 23 (10111) -> (11101) 29
        assertEquals(29, Exercise07.reverseBinary(23));

        // Trường hợp số có dạng 2^k: 8 (1000) -> (0001) 1
        assertEquals(1, Exercise07.reverseBinary(8));

        // Trường hợp số 0
        assertEquals(0, Exercise07.reverseBinary(0));

        // Trường hợp số 1
        assertEquals(1, Exercise07.reverseBinary(1));

        // Trường hợp số có biểu diễn nhị phân đối xứng (palindrome): 27 (11011) -> (11011) 27
        assertEquals(27, Exercise07.reverseBinary(27));

        // Trường hợp khác: 100 (1100100) -> (0010011) 19
        assertEquals(19, Exercise07.reverseBinary(100));
    }
}
