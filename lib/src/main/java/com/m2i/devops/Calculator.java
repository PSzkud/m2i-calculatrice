package com.m2i.devops;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub (int a, int b) {
		return a - b;
	}
	
	public int multiplication(int a, int b) {
		return a * b;
	}
	
	public boolean isPair(int a) {
		
		return (a % 2) == 0;
	}
}
