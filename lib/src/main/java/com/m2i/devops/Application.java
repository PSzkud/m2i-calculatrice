package com.m2i.devops;

public class Application {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		Calculator calc = new Calculator();
		int result = calc.add(1, 1);
	}

}
