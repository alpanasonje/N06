package com.tnsif.testcases;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMethodsClass {
	@BeforeAll
	public static void testBeforeAll() {
		System.out.println("test before all");
	}

	@BeforeEach
	public void testBeforeEach() {
		System.out.println("test before each");
	}

	@Test
	public void testMethodOne() {
		System.out.println("Test Method One");
	}

	@Test
	public void testMethodTwo() {
		System.out.println("Test Method Two");
	}

	@AfterEach
	public void testAfterEach() {
		System.out.println("test after each");
	}

	@AfterAll
	public static void testAfterAll() {
		System.out.println("test after all");
	}

}
