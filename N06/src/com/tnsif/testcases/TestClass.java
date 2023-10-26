package com.tnsif.testcases;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import com.tnsif.businesslogic.Operations;



public class TestClass {
	@Test
	public void testForNull() {
		assertNull(Operations.getName());
	}
	@Test
	public void testForNotNull() {
		assertNotNull(Operations.getName());
	}
	
	@Test
	public void testForException()
	{		
		assertThrows(ArithmeticException.class,()->Operations.performDivision(10,2));
	}
	@Test
	public void testForArithmeticException()
	{		
		assertThrows(ArithmeticException.class,()->Operations.performDivision(10,0));
	}
	
	@Test
	public void testFail() {
		fail("It is suppose to fail");
	}
	
	@TestFactory
	public Collection<DynamicTest> generateTestCases()
	{
		return  Arrays.asList(DynamicTest.dynamicTest("FirstDynamicTest",()-> Assert.assertTrue(10>2)),
				DynamicTest.dynamicTest("AdditionDynamicTest", ()->assertEquals(5,Operations.addition(2, 3))),
				DynamicTest.dynamicTest("AdditionNegativeDynamicTest", ()->assertEquals(10,Operations.addition(2, 3))),
				DynamicTest.dynamicTest("DynamicTestThrowsException",()->new ArithmeticException()));
		
		
	}
}
