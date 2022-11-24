package com.java.spring.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoPlusTwoShouldEqualFour() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(4, simpleCalculator.add(2, 2));
    }

    @Test
    void threePlusSevenShouldEqualTen() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(10, simpleCalculator.add(3, 7));
    }
}