package qsp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;

public class fbpage 
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		/*TakesScreenshot ts =(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/name.png");
		try 
		{
			Files.copy(src, dest);
		}
		catch (IOException e)
		{
			
		}
		}*/
		String title="facebook";
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try
		{
		wait.until(ExpectedConditions.titleIs(title));
		Reporter.log("Title is matching "+title,true);
		}
		catch (Exception e) 
		{
			Reporter.log("Title is not matching "+driver.getTitle(),true);
			Assert.fail();
		}
	}

}
