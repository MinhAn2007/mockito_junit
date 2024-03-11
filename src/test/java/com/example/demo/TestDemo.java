package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDemo {
    Calc calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calc();
    }
    @Test
    @DisplayName("Simple multiplication should work")
    void testMultiply() {
        Assertions.assertEquals(20, calculator.multiply(4, 5),
                "Regular multiplication should work");
    }
    @Test
    void exceptionTesting() {
        // set up user
        User user = null;
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> user.setAge(Integer.parseInt("23")));
        Assertions.assertEquals("Age must be an Integer.", exception.getMessage());
    }
    @Test
    @DisplayName("Simple multiplication should work")
    void testMultiply2() {
        Assertions.assertEquals(21, calculator.multiply(4, 5),
                "Regular multiplication should work");
    }
}
