package explicitPackage;

import explicitPackage.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverCon {
	public static WebDriver driver = null;

	public static WebDriver SetBrowser()
	{
		System.setProperty("webdriver.chrome.driver", Util.Path_FirefoxDriver);
		// Initialize browser
		driver=new ChromeDriver();
		return driver;
	}

}
