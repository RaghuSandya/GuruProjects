package AllBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEBrowser {
	public static void main(String[] args) {
		
		DesiredCapabilities IEcaps = DesiredCapabilities.internetExplorer();
	    IEcaps .setCapability(
	    InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
	    true);
		System.setProperty("webdriver.ie.driver", "D:\\EclipseWorkBench\\Libs\\IEDriverServer (2).exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.youtube.com/");
	}

}
