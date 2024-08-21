package com.bridgelaz.JunitTesting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AssertionsTesting {

	Calculator cal;
	Palindrome pal;
	@BeforeEach
	public void init()
	{
		cal=new Calculator();
		pal=new Palindrome();
	}

	@Test
	public void assertEqualsTest()
	{
		//int sum = cal.add(2,2);

		//		if(sum==2)
		//		{
		//			System.out.println("pass");
		//		}
		//		else
		//		{
		//			System.out.println("fail");
		//		}

		/* if and else do not work properly
		 *  if test is passed and failed also 
		 *  if shows that test case is passed green line 
		 */

		//assertEquals(1,cal.add(5,5),"test is not passed ");

		assertEquals(10,cal.add(5,5),"test is  not passed ");
	}

	@Test
	public void assertNotEqualsTest()
	{
		assertNotEquals(1,cal.add(5,5),"test is  not passed ");
	}

	@Test
	public void assertArraysTesting()
	{
		int a[]= {1,2,3};
		int b[]= {1,2,3};
		assertArrayEquals(a,b);
		// checks sequnece
		// checks length 
		// checks all elements are same or not 
		// if any of the above condition is failed tase case is failed 
	}

	@Test
	public void assertTrueTesting()
	{
		assertTrue(pal.check_Palindrome("madam"),()-> " not palindrome ");
	}


}
