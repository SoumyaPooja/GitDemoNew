package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {

	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
	}
	@Test(groups={"Smoke"})
	public void Demo()
	{
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	@AfterSuite
	public void AfSuite()
	{
		System.out.println("I am no 1 from last");
	}
	
	@Test
	public void secondTest()
	{
		System.out.println("Bye");
		System.out.println("Bye 2");
		System.out.println("Bye 3");
		//aaaaaa
		System.out.println("Bye 4");
		System.out.println("Bye 5");
		//bbbbbbbbbb
		System.out.println("Bye 6");
		System.out.println("Bye 7");
		System.out.println("Bye 8");
		System.out.println("Bye 9");

	}
}
