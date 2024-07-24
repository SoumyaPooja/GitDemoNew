package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	@Parameters({ "URL","APIKey" })
	@Test
	public void webLoginHomeLoan(String uname,String Key)
	{
		System.out.println("WebLoginHome");
		System.out.println(uname);
		System.out.println(Key);

		
	}
	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHome");
	}
	@Test(dependsOnMethods={"webLoginHomeLoan"})
	public void APILoginHomeLoan()
	{
		System.out.println("APILoginHome");
	}

}
