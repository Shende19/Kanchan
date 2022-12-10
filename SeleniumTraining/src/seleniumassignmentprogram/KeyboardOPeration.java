package seleniumassignmentprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOPeration {
	
	static WebDriver  driver;
	static String sDriverPath = System.getProperty("user.dir") + "//Drivers//" ;
	
	static void fLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//" );
		driver= new ChromeDriver();
	}

	public static void main(String[] args) {
		fLaunchBrowser(); 
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//using Escape of keyboard to avoid login pop
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		 

	}

}
