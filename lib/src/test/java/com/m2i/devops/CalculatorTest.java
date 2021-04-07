package com.m2i.devops;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		int a = 2;
		int b = 3;
		
		Calculator calc = new Calculator();
		int actual = calc.add(a, b);
		
		assertEquals(5, actual);
	}

	@Test
	public void testSub() {
		int a = 6;
		int b = 3;
		
		Calculator calc = new Calculator();
		int actual = calc.sub(a, b);
		
		assertEquals(3, actual);
	}

	@Test
	public void testMultiplication() {
		int a = 2;
		int b = 3;
		
		Calculator calc = new Calculator();
		int actual = calc.multiplication(a, b);
		
		assertEquals(6, actual);
	}
	
	@Test
	public void testIsPair() {
		int a = 3;
		int b = 2;
		
		Calculator calc = new Calculator();
		
		boolean actual1 = calc.isPair(a);
		boolean actual2 = calc.isPair(b);
		
		assertFalse(actual1);
		assertTrue(actual2);
	}
}
