package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select 
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
		driver.get("file:///C:/Users/Pluto/Desktop/14.selectclass.html");
		WebElement hotel = driver.findElement(By.id("bhagini"));
		Select sel = new Select(hotel);	
		HashSet<String> dup= new HashSet<String>();
		List<WebElement> alloptins = sel.getOptions();		
		for(WebElement opt:alloptins)			
		{
			String text = opt.getText();				
			System.out.println("only unique options .....");
			if(!dup.add(text))
				{
			System.out.println(text);
				}
		}
	}
}
