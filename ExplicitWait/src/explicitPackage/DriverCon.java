package explicitPackage;

import explicitPackage.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Driver Class
public class DriverCon {
	public static WebDriver driver = null;

	public static WebDriver SetBrowser()
	{
		System.setProperty("webdriver.chrome.driver", Util.Path_FirefoxDriver);
		// Initialize browser
		driver=new ChromeDriver();
		return driver;
	}
	public static void SetUp()
	{
		driver.get(Util.URL);
		// Maximize browser
		driver.manage().window().maximize();
	}
	public static void QuitDriver()
	{
		driver.quit();
	}
}
