package qsp;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actions 
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Pluto/Desktop/17.frames%202%20eg/page1.html");
		//to enter the text in me text fld
		driver.findElement(By.id("m")).sendKeys("dinga");
		Thread.sleep(2000);
		//to switch to frame page
		driver.switchTo().frame(0);
		driver.findElement(By.id("gf1")).sendKeys("dingi");
		Thread.sleep(2000);
		//to switch to child frame
		driver.switchTo().frame(0);
		driver.findElement(By.id("s")).sendKeys("rangi");
		Thread.sleep(2000);
		//to switch to parent frame
		driver.switchTo().parentFrame();
		driver.findElement(By.id("k")).sendKeys("binga");
		Thread.sleep(2000);
		// to switch back to dft page
		driver.switchTo().defaultContent();
		driver.findElement(By.id("gf2")).sendKeys("mangi");
		Thread.sleep(2000);
		driver.close();
		
	}

}
