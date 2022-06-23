package test;

import org.testng.annotations.Test;

public class R5 {
	@Test
	public void includeTest() {
		System.out.println("iNcLuDe");
	}

	@Test(groups="Smoke")
	public void excludeTest() {
		System.out.println("ExClUdE");
	}
}
