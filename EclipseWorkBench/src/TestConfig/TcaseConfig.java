package TestConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Utility.CongifReader;


public class TcaseConfig {
	@Test
	public void testcase() throws Exception {
		
		CongifReader read=new CongifReader();
		
		System.setProperty("webdriver.chrome.driver",read.getChromeDriver());
		WebDriver driver=new ChromeDriver();
		driver.get(read.getUrl());
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(read.Username());
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(read.Password());
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	
	}
	


}
