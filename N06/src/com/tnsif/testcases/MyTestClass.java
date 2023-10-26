package com.tnsif.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.tnsif.businesslogic.Operations;

//@Test not allowed, allow only at method level
//@Disabled
public class MyTestClass {
	
	//@Test - use for unit testing 
	//@Test
	//@RepeatedTest(0)
	@RepeatedTest(1)
	public void testFactorial() {
		long result = Operations.getFactorial(4);
		long answer = 24;
		Assertions.assertEquals(answer, result);
	}
	
	@Test
	public void testFactorialForZero()
	{
		long actual = Operations.getFactorial(0);
		long expected = 1;
		Assertions.assertEquals(expected, actual);	
	}
	
	@ParameterizedTest
	@CsvSource({"3, 6","0, 1","-4, -1","7, 5040"})
	public void testForFactorial(int no, long expected)
	{
		long actual=Operations.getFactorial(no);
		assertEquals(expected, actual);				
	}
	@Disabled
	@Test
	public void testFactorialForNegativeNumbers()
	{
		long actual = Operations.getFactorial(-6);
		long expected = -1;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testForNonPrimePrimePos()
	{
		Assertions.assertFalse(Operations.isPrime(12));
	}
	@Test
	public void testForNonPrimeNeg()
	{
		Assertions.assertTrue(Operations.isPrime(12));
	}
	@Test
	public void testForPrimePrimePos()
	{
		Assertions.assertTrue(Operations.isPrime(5));
	}
	@Test
	public void testForPrimeNeg()
	{
		Assertions.assertFalse(Operations.isPrime(5));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {2,3,4})
	public void testForPrime(int no)
	{
		assertTrue(Operations.isPrime(no));
	}
	@Test
	public void testForNumberPalindrome()
	{
		assertTrue(Operations.isNumberPalindrome(121));
	}
	@Test
	public void testForNumberNotPalindrome()
	{
		assertFalse(Operations.isNumberPalindrome(123));
	}

	@ParameterizedTest
	@CsvSource({"1221, true", "4501, false"})
	public void testForNumberPalindrome(int no, boolean expected)
	{
		assertEquals(expected, Operations.isNumberPalindrome(no) );
	}
	
	@ParameterizedTest
	@CsvSource({"CAR, false", "RACECAR, true"})
	public void testForStringPalindrome(String s, boolean expected)
	{
		assertEquals(expected, Operations.isStringPalindrome(s) );
	}
	
	@ParameterizedTest
	@EnumSource(TimeUnit.class)
	public void testForEnums(TimeUnit t)
	{
		System.out.println(t);
	}

}
