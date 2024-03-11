package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

@SpringBootTest
class DemoApplicationTests {
	private Calc calc;

	@Test
	@DisplayName("aaaa")
	void contextLoads() {
		Calc calc1 = new Calc();
		Assertions.assertEquals(10,calc1.multiply(2,5));
	}

}
