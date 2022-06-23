package test;

import org.testng.annotations.Test;

public class R1 {
	@Test
	public void testCase1() {
		System.out.println("Test 1");
	}

	@Test(groups="Smoke")
	public void testCase2() {
		System.out.println("Test 2");
	}
}
