//sample test cases based on Assumptions
package com.tnsif.testcases;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {
	@Test
	void testOnFirstAssumption() {
		int a = 5, s = 20;
		Assumptions.assumeTrue(s == a * a);
		System.out.println("--This will display because assumptions are true--");
	}

	@Test
	void testOnSecondAssumption() {
		int age = 21;
		Assumptions.assumeFalse(age < 18, AssumptionDemo.message());
		System.out.println("--- This will skip ----");
	}

	private static String message() {
		return "TEST Execution Failed ";
	}

	@Test
	void testOnThirdAssumption() {
		int a = 5, b = 5;
		Assumptions.assumingThat(a == b, () -> {
			System.out.println("Testing a==b");
		});
		System.out.println("--- This will not skip ----");
	}
}
