package chapter1.sub1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution5Test {
    @Test
    void it_return_true() {
        assertAll(
                () ->assertTrue(Solution5.result(0.3, 0.5)),
                () ->assertTrue(Solution5.result(0.1, 0.9)),
                () ->assertTrue(Solution5.result(0.00001, 0.999))
        );
    }
    @Test
    void it_return_false() {
        assertAll(
                () ->assertFalse(Solution5.result(0.0, 0.5)),
                () ->assertFalse(Solution5.result(0.1, 1.0)),
                () ->assertFalse(Solution5.result(2.0, 0.0))
        );
    }
}
