package launchingbrowseroperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {
	static WebDriver driver;
	static String sDriverPath = System.getProperty("user.dir") + "\\Drivers\\";

	public static void FBrowserLaunching()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "\\chromedriver.exe\\");
		driver = new ChromeDriver();

	}

	public static void main(String[] args)
	{
		FBrowserLaunching();
		String sURL = ("https://www.flipkart.com");
		driver.get(sURL);
		driver.manage().window().maximize();
		driver.findElement(By.className("_3704LK")).sendKeys("iphone");
		String sXpath = "//button[@class='L0Z3Pu']";
		driver.findElement(By.xpath(sXpath)).click();
		 
//   		String sFashionXpath = "//img[@alt='Fashion']";
//   		driver.findElement(By.xpath(sFashionXpath)).click();
   		 
 		
	}

}
