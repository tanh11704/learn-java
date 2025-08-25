package learn.java.basic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise04Test {
    @Test
    void testGenerateFibonacci() {
        // Trường hợp thông thường
        assertEquals(Arrays.asList(1, 1, 2, 3, 5, 8), Exercise04.generateFibonacci(10));
        assertEquals(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89), Exercise04.generateFibonacci(100));

        // Trường hợp n bằng một số Fibonacci
        assertEquals(Arrays.asList(1, 1, 2, 3, 5, 8), Exercise04.generateFibonacci(8));

        // Trường hợp biên: n nhỏ
        assertEquals(Arrays.asList(1, 1), Exercise04.generateFibonacci(1));
        assertEquals(Arrays.asList(1, 1, 2), Exercise04.generateFibonacci(2));

        // Trường hợp n < 1, trả về danh sách rỗng
        assertEquals(Collections.emptyList(), Exercise04.generateFibonacci(0));
        assertEquals(Collections.emptyList(), Exercise04.generateFibonacci(-5));
    }
}
