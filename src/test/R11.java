package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class R11 {
	@Test(dataProvider="getData")
	public void login(String username,String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		//3 - No.of Combinations, 2 - No.of Values for that Combination
		data[0][0]="1st Username";
		data[0][1]="1st Password";
		
		data[1][0]="2nd Username";
		data[1][1]="2nd Password";
		
		data[2][0]="3rd Username";
		data[2][1]="3rd Password";
		
		return data;
	}
}
