package test;

import org.testng.annotations.Test;

public class R2 {
	@Test
	public void testCase3() {
		System.out.println("Test 3");
	}

	@Test(groups="Smoke")
	public void testCase4() {
		System.out.println("Test 4");
	}
}
