package chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1Test {
    @Test
    void it_return_equal() {
        String result = Solution1.result(3, 3, 3);
        assertEquals(result, "equal");
    }

    @Test
    void it_return_not_equal_when_1_3_3() {
        String result = Solution1.result(1, 3, 3);
        assertEquals(result, "not equal");
    }

    @Test
    void it_return_not_equal_when_1_2_3() {
        String result = Solution1.result(1, 2, 3);
        assertEquals(result, "not equal");
    }
}