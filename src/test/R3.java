package test;

import org.testng.annotations.Test;

public class R3 {
	@Test
	public void webLogin() {
		System.out.println("Web Login");
	}
	@Test
	public void mobileLogin() {
		System.out.println("Mobile Login");
	}
	@Test(groups="Smoke")
	public void apiLogin() {
		System.out.println("API Login");
	}
}
