package test;

import org.testng.annotations.Test;

public class R8 {
	@Test
	public void banana() {
		System.out.println("Banana");
	}
	@Test
	public void guava() {
		System.out.println("Guava");
	}
	@Test(dependsOnMethods={"guava","banana"})
	public void apple() {
		System.out.println("Apple");
	}
	@Test(enabled=true)
	public void strawberry()
	{
		System.out.println("Strawberry");
	}
}
