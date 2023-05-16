package Testng.ramkumar;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Bank {
	@Test(priority=1)
	public void withdraw()
	{
		System.out.println("logic for withdraw");
	}
	@BeforeClass
	public  static void openapp()
	{
		System.out.println("logic for openapp");
	}
	@AfterClass
	public static void closeapp()
	{
		System.out.println("logic for closeapp");
	}
	@BeforeMethod
	public void login()
	{
		System.out.println("logic for login");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("logic for logout");
	}
	@Test(priority=3)
	public void deposit()
	{
		System.out.println("logic for deposit");
	}
	@Test(priority=2)
	public void balance()
	{
		System.out.println("logic for check balance");
	}
	

}
