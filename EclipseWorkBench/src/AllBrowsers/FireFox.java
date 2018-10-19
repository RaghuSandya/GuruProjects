package AllBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "D:\\EclipseWorkBench\\Libs\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
	}

}
