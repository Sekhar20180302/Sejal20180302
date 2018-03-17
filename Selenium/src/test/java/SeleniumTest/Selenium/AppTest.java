package SeleniumTest.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
@Test
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
    			
    			System.out.print("Bye Bye!!!");
    }
}
