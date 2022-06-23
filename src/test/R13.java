package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class R13 {
	@Test
	public void regex1() {
		System.out.println("Regex 1");
	}
	@Test
	public void regex2() {
		System.out.println("Regex 2");
		Assert.assertTrue(false);
	}
	@Test
	public void regex3() {
		System.out.println("Regex 3");
	}
}
