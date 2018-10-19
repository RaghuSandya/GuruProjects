package AllBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkBench\\Libs\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=GxTHU_91Z1Q");
	}

}
