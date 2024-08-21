package com.bridgelaz.JunitTesting;

public class Calculator {

	public int add(int a,int b)
	{
		return a+b;
	}

	public int sub(int a,int b)
	{
		return a-b;
	}

	public int multiply(int a,int b)
	{
		return a*b;
	}

	public int divide(int a,int b) 
	{
		if(b<=0)
		{
			throw new ArithmeticException(" dinominator should be greater than 0");
		}
		return a/b;
	}

	public void timeOutTesting()
	{
		for(int i=0;i<=1000000000;i++)
		{
			
		}
	}

}
