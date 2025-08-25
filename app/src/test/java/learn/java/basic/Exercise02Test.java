package learn.java.basic;

import main.java.learn.java.basic.Exercise02;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise02Test {
    @Test
    void testSumOfDigits() {
        // Trường hợp số dương nhiều chữ số
        assertEquals(15, Exercise02.sumOfDigits(12345));
        assertEquals(6, Exercise02.sumOfDigits(600));

        // Trường hợp số có một chữ số
        assertEquals(7, Exercise02.sumOfDigits(7));

        // Trường hợp số 0
        assertEquals(0, Exercise02.sumOfDigits(0));

        // Trường hợp số âm (thường tính tổng chữ số của giá trị tuyệt đối)
        assertEquals(24, Exercise02.sumOfDigits(-987));
    }
}
