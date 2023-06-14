package chapter1.sub1;

import org.junit.jupiter.api.Test;

import static chapter1.sub1.Solution9.toBinaryString;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution9Test {
    @Test
    void it_binary() {
        assertAll(
                () -> assertEquals(toBinaryString(9), Integer.toBinaryString(9)),
                () -> assertEquals(toBinaryString(11), Integer.toBinaryString(11)),
                () -> assertEquals(toBinaryString(20), Integer.toBinaryString(20)),
                () -> assertEquals(toBinaryString(1351), Integer.toBinaryString(1351))
        );
    }
}