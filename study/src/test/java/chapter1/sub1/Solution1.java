package chapter1.sub1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution1 {
    @Test
    void problem1_1_a() {
        assertEquals(((0 + 15) / 2), 7);
    }

    @Test
    void problem1_1_b() {
        assertEquals(2.0e-6 * 100000000.1, 200.0000002);
    }

    @Test
    void problem1_1_c() {
        assertEquals((true && false || true && true), true);
    }

    @Test
    void problem1_2_a() {
        double result = (1 + 2.236) / 2;
    }

    @Test
    void problem1_2_b() {
        double v = 1 + 2 + 3 + 4.0;
    }

    @Test
    void problem1_2_c() {
        boolean b = 4.1 >= 4;
    }
    @Test
    void problem1_2_d(){
        String s = 1 + 2 + "3";
    }
    @Test
    void problem1_4_a(){
        int a = 1;
        int b = 2;
        int c;
        if (a > b) { c = 0; }
        if( a > b) c = 0;
        if ( a > b) c = 0; else b = 0;
    }
}

