package com.example.demo;

import com.example.demo.modules.User;
import org.junit.jupiter.api.*;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;
public class TestDemo {
    Calc calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calc();
    }


    @TestFactory
    Stream<DynamicTest> dynamicTests() {
        return Stream.of("applaaae", "banana", "orange")
                .map(fruit -> dynamicTest("test " + fruit, () -> {
                    assertTrue(fruit.length() < 0);
                }));
    }

}
