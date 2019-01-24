package explicitPackage;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TheBankJob {
	@Test
	public void BankJob() throws Exception{
		// TODO Auto-generated method stub
		WebDriverWait wait = null;
		String expectedTitle="Guru99 Bank Home Page";
		WebDriver driver=null;
		String actualTitle=null;
		DOMConfigurator.configure("log4j.xml");
		Log4j2Example.info("Browser opened and website launched");
		for(int i=1;i<=4;i++)
		{
			try
			{
				driver=DriverCon.SetBrowser();
				DriverCon.SetUp();
				Log4j2Example.info("Get the title and compare the expected result");
				actualTitle=driver.getTitle();
				excelRead.setExcelFile(Util.File_TestData, "Data");
				Log4j2Example.info("Reading Data from Excel");
				Util.Username=excelRead.getCellData(i, 1);
				Util.Password=excelRead.getCellData(i, 2);
				//https://www.guru99.com/implicit-explicit-waits-selenium.html
				wait = new WebDriverWait(driver, 15);
				wait.until(ExpectedConditions.titleContains("Guru99 Bank Home Page"));
				Log4j2Example.info("If correct page then login");
				if(actualTitle.contains(expectedTitle))
				{
					WebElement web=driver.findElement(By.name("uid"));
					web.sendKeys(Util.Username);
					Log4j2Example.info("Enter the User name");
					WebElement pass=driver.findElement(By.name("password"));
					pass.sendKeys(Util.Password);
					Log4j2Example.info("Enter the password");
					WebElement btnClick=driver.findElement(By.name("btnLogin"));
					btnClick.click();
					Log4j2Example.info("click ok to login");
					Alert alt = driver.switchTo().alert();					
					String actualBoxtitle = alt.getText(); 
					//System.out.println(actualBoxtitle);// get content of the Alter Message
					Thread.sleep(1000);
					alt.accept();
					if (actualBoxtitle.contains(Util.EXPECT_ERROR)) 
					{ // Compare Error Text with Expected Error Value
					    System.out.println("Test case SS[" + i + "]: Passed"); 
					} else {
					    System.out.println("Test case SS[" + i + "]: Failed");
					}
				}
				else
				{
					System.out.println("Incorrect website!!!!");
					DriverCon.QuitDriver();
					break;
				}
				}
			    catch (NoAlertPresentException Ex){ 
			    	actualTitle = driver.getTitle();
					// On Successful login compare Actual Page Title with Expected Title
					if (actualTitle.contains(Util.EXPECT_TITLE)) {
					    System.out.println("Test case SS[" + i + "]: Passed");
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
					    System.out.println("Test case SS[" + i + "]: Failed");
					}
				} 
			DriverCon.QuitDriver();
			}
		}
	}