package SeleniumTest.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public void Demo()
    {
    	// TODO Auto-generated method stub
    			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sekhar\\Eclipse-Workspace\\Selenium Drivers\\chromedriver.exe");
    			 
    			// Initialize browser
    			WebDriver driver=new ChromeDriver();
    			 
    			// Open facebook
    			driver.get("http://www.facebook.com");
    			 
    			// Maximize browser
    			driver.manage().window().maximize();
    }
}
