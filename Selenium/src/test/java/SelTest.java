

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
		 
		// Open facebook page
		driver.get("http://www.facebook.com");
		// Maximize browsers
		driver.manage().window().maximize();
		//Print
		System.out.println("Hello World!!!!");
		//Check This
		System.out.println("Hello World!!!!");
		System.out.println("Quit Driver");
		//Done
		driver.quit();
	}

}
