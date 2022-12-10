package seleniumassignmentprogram;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOperation5 {
	static WebDriver driver;
	static String sDriverPath = System.getProperty("user.dir") + "//Drivers//";
	
	static void FLaunchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//" );
		driver = new ChromeDriver();
		
	}

	public static void main(String[] args) throws InterruptedException {
		FLaunchBrowser();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		try {
			WebElement element = driver.findElement(By.xpath("//body"));
			element.sendKeys(Keys.ESCAPE);
		}
		catch(NoSuchElementException e) {
		}
		Thread.sleep(1600);
		driver.findElement(By.cssSelector("body")).sendKeys("https://www.flipkart.com" );
		
		
		}
		
		 
	}


