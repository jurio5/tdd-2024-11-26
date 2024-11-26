package com.ll;

import org.assertj.core.api.AbstractIntegerAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleCalculatorTest {

    @Test
    @DisplayName("1 + 2 = 3")
    public void testPlus() {
        SimpleCalculator calculator = new SimpleCalculator();

        int rs = calculator.plus(1, 2);

        assertEquals(3, rs);
    }
}
