package test;

import org.testng.annotations.Test;

public class R4 {
	@Test
	public void webLoginHome() {
		System.out.println("Web Login Home");
	}
	@Test
	public void mobileLoginHome() {
		System.out.println("Mobile Login Home");
	}
	@Test(groups="Smoke")
	public void apiLoginHome() {
		System.out.println("API Login Home");
	}
}
