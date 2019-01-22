

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelTest {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sekhar\\Eclipse-Workspace\\Selenium Drivers\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("http://www.facebook.com");
		 
		// Maximize browser
		driver.manage().window().maximize();
		
		System.out.println("Hello World!!!!");
		System.out.println("Welcome to Facebook!!!");
		System.out.println("Quit");
		
		driver.quit();
	}

}
