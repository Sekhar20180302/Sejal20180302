package explicitPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverCon {
	public static WebDriver driver = null;

	public static WebDriver SetBrowser()
	{
		System.setProperty("webdriver.gecko.driver", Util.Path_FirefoxDriver);
		// Initialize browser
		driver=new FirefoxDriver();
		return driver;
	}

}
