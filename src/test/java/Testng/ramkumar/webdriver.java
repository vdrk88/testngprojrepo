package Testng.ramkumar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webdriver {
	@Test
	public void web()
	{
	System.setProperty("webdriver.chrome.driver","E:\\n\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://omayo.blogspot.com/");
	}
	

}
