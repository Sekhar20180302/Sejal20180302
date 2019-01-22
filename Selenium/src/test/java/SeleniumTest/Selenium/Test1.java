package SeleniumTest.Selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {
	@Test
public void Demo()
	 
	 {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sekhar\\Eclipse-Workspace\\Selenium Drivers\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		 driver.quit();
		// Maximize browser
			
		System.out.println("bye bye");
}
 }
