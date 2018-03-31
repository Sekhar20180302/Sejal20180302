package explicitPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expectedTitle="Guru99 Bank Home Page";
		WebDriver driver=DriverCon.SetBrowser();
		String actualTitle=null;
		// Open facebook
		driver.get(Util.URL);
		
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
			web.sendKeys(Util.Username);
			WebElement pass=driver.findElement(By.name("password"));
			pass.sendKeys(Util.Password);
			WebElement btnClick=driver.findElement(By.name("btnLogin"));
			btnClick.click();
			wait.until(ExpectedConditions.titleContains("Manager HomePage"));			
			actualTitle=driver.getTitle();
			if(actualTitle.contains("Manager"))
			{
				System.out.println("Welcome to the Home Page");
			}
			else
			{
				System.out.println("THis is not home page");
			}
		}
		else
		{
			System.out.println("Incorrect website!!!!");
		}
	}

}
