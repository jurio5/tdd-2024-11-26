package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

public class SimpleCalculatorTest {

    @Test
    @DisplayName("1 + 2 = 3")
    public void t1() {
        SimpleCalculator calculator = new SimpleCalculator();

        int rs = calculator.plus(1, 2);

        assertThat(rs).isEqualTo(3);
//        assertEquals(3, rs);
    }

    @Test
    @DisplayName("2 + 10 = 12")
    public void t2() {
        SimpleCalculator calculator = new SimpleCalculator();

        int rs = calculator.plus(2, 10);

        assertThat(rs).isEqualTo(12);
//        assertEquals(12, rs);
    }

    @Test
    @DisplayName("20 + 10 = 30")
    public void t3() {
        SimpleCalculator calculator = new SimpleCalculator();

        int rs = calculator.plus(20, 10);

        assertThat(rs).isEqualTo(30);
//        assertEquals(30, rs);
    }

    @Test
    @DisplayName("2 * 3 = 6")
    public void multiply1() {
        SimpleCalculator calculator = new SimpleCalculator();

        int rs = calculator.multiply(2, 3);

        assertThat(rs).isEqualTo(6);
//        assertEquals(6, rs);
    }

    @Test
    @DisplayName("3 * 2 = 1")
    public void minus1() {
        SimpleCalculator calculator = new SimpleCalculator();

        int rs = calculator.minus(3, 2);

        assertThat(rs).isEqualTo(1);
//        assertEquals(1, rs);
    }

    @Test
    @DisplayName("5 / 2 = 2")
    public void divide1() {
        SimpleCalculator calculator = new SimpleCalculator();

        int rs = calculator.divide(5, 2);

        assertThat(rs).isEqualTo(2);
//        assertEquals(2, rs);
    }

    @Test
    @DisplayName("3 % 2 = 1 .. 1")

    public void reminder1() {
        SimpleCalculator calculator = new SimpleCalculator();

        int rs = calculator.reminder(3, 2);

        assertThat(rs).isEqualTo(1);
//        assertEquals(1, rs);
    }
}
