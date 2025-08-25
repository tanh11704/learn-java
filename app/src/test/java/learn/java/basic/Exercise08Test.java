package learn.java.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exercise08Test {
    @Test
    void testDecimalToRoman() {
        // Trường hợp cơ bản
        assertEquals("III", Exercise08.decimalToRoman(3));
        assertEquals("LVIII", Exercise08.decimalToRoman(58));

        // Trường hợp có quy tắc trừ
        assertEquals("IV", Exercise08.decimalToRoman(4));
        assertEquals("IX", Exercise08.decimalToRoman(9));
        assertEquals("XL", Exercise08.decimalToRoman(40));
        assertEquals("XC", Exercise08.decimalToRoman(90));
        assertEquals("CD", Exercise08.decimalToRoman(400));
        assertEquals("CM", Exercise08.decimalToRoman(900));

        // Trường hợp phức tạp
        assertEquals("MCMXCIV", Exercise08.decimalToRoman(1994));
        assertEquals("MMXXIV", Exercise08.decimalToRoman(2024));

        // Trường hợp biên (giả sử giới hạn là 1 đến 3999)
        assertEquals("I", Exercise08.decimalToRoman(1));
        assertEquals("MMMCMXCIX", Exercise08.decimalToRoman(3999));

        // Trường hợp không hợp lệ, ném ra ngoại lệ
        assertThrows(IllegalArgumentException.class, () -> Exercise08.decimalToRoman(0));
        assertThrows(IllegalArgumentException.class, () -> Exercise08.decimalToRoman(4000));
        assertThrows(IllegalArgumentException.class, () -> Exercise08.decimalToRoman(-10));
    }
}
