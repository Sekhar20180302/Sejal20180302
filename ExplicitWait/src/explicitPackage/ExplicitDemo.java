package explicitPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expectedTitle="Guru99 Bank Home Page";
		String actualTitle=null;
		String baseUrl="http://www.demo.guru99.com/V4/";
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sekhar\\Eclipse-Workspace\\Selenium Drivers\\geckodriver.exe");
		 
		// Initialize browser
		WebDriver driver=new FirefoxDriver();
		
		// Open facebook
		driver.get(baseUrl);
		
		// Maximize browser
		driver.manage().window().maximize();
		
		actualTitle=driver.getTitle();
		
		//https://www.guru99.com/implicit-explicit-waits-selenium.html
		WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.titleContains("Guru99 Bank Home Page"));

		if(actualTitle.contains(expectedTitle))
		{
			System.out.println("");
			WebElement web=driver.findElement(By.name("uid"));
			web.sendKeys("mngr125638");
			WebElement pass=driver.findElement(By.name("password"));
			pass.sendKeys("aqYnupU");
			WebElement btnClick=driver.findElement(By.name("btnLogin"));
			btnClick.click();
		}
		else
		{
			System.out.println("Incorrect website!!!!");
		}
	}

}
