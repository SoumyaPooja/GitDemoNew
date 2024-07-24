package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test(enabled=false)
	public void webLoginCarLoan()
	{
		System.out.println("WebLoginCar");
	}
	@BeforeMethod
	public void beforeEvery()
	{
		System.out.println("I will execute before every method in class Day 3");
	}
	@AfterMethod
	public void afterEvery()
	{
		System.out.println("I will execute after every method in class Day 3");
	}
	
	@Test(dataProvider="getData")
	public void MobileLoginCarLoan(String username, String password)
	{
		System.out.println("MobileLoginCar");
		System.out.println(username);
		System.out.println(password);

		
	}
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am no 1");
	}
	@BeforeClass
	public void bfclass()
	{
		System.out.println("I will execute before any method in class");
	}
	@AfterClass
	public void afclass()
	{
		System.out.println("I will execute after all method in class");
	}
	@Test
	public void APILoginCarLoan()
	{
		System.out.println("APILoginCar");
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		//First set
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		
		//Second set
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
		//Third set
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
	}

}
