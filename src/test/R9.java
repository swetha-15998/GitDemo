package test;

import org.testng.annotations.Test;

public class R9 {
	@Test
	public void pineapple() {
		System.out.println("Pineapple");
	}
	@Test
	public void mango() {
		System.out.println("Mango");
	}
	@Test
	public void cherry() {
		System.out.println("Cherry");
	}
	@Test
	public void banana() {
		System.out.println("Banana");
	}
	@Test(groups="Smoke")
	public void apple() {
		System.out.println("Apple");
	}
}
