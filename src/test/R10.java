package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class R10 {
@Parameters({"URL","APIKey"})
@Test
public void parameterising(String url,String key)
{
	System.out.println(url);
	System.out.println(key);
	
}
}
