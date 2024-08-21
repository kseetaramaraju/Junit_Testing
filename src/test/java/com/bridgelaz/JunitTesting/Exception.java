package com.bridgelaz.JunitTesting;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Exception {

	Calculator cal;

	@BeforeEach
	public void init()
	{
		cal=new Calculator();
		System.out.println(" executed every time before every method ");
	}

	@Test
	public void exceptiontesting()
	{
		assertThrows(ArithmeticException.class,()-> cal.divide(10, 0));
	}

}
