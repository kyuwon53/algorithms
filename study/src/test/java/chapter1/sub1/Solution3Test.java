package chapter1.sub1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution3Test {
    @Test
    void it_return_equal() {
        String result = Solution3.result(3, 3, 3);
        assertEquals(result, "equal");
    }

    @Test
    void it_return_not_equal() {

        assertAll(
                () -> assertEquals(Solution3.result(1, 3, 3), "not equal"),
                () -> assertEquals(Solution3.result(1, 2, 3), "not equal")
        );
    }
}
