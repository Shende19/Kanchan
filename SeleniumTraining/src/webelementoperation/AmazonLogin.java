package webelementoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {
	 static WebDriver driver;
	 static String sDriverPath = System.getProperty("user.dir") + "//Drivers//";
	 
	public static void FBrowserLaunching()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//" );
		driver = new ChromeDriver();
	}
	
	public static void main(String[] args) {
		FBrowserLaunching();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.navigate().back();
 		driver.findElement(By.linkText("Today's Deals")).click();
 		driver.navigate().refresh();
 		driver.navigate().back();
//		driver.findElement(By.linkText("12 Days of Deals")).click();
//		driver.navigate().back();
 		driver.findElement(By.linkText("Customer Service")).click();
 		driver.navigate().back();
		
	}

}
