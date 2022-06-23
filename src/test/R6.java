package test;


import org.testng.annotations.Test;

public class R6 {
	@Test
	public void regex1() {
		System.out.println("Regex 1");
	}
	@Test
	public void regex2() {
		System.out.println("Regex 2");
	}
	@Test
	public void regex3() {
		System.out.println("Regex 3");
	}
	
	@Test
	public void aregex1() {
		System.out.println("Regex 4");
	}
	@Test
	public void aregex2() {
		System.out.println("Regex 5");
	}
	@Test(groups="Smoke")
	public void aregex3() {
		System.out.println("Regex 6");
	}
	
}
