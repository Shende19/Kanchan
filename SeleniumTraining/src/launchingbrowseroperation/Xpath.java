package launchingbrowseroperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	static WebDriver driver;
	static String sDriverPath = System.getProperty("user.dir") + "\\Drivers\\";
	
	public static void fLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "\\chromedriver.exe\\");
		driver = new ChromeDriver();	
	}
	
	public static void main(String[] args) {
		fLaunchBrowser();
//		String sURL = "https://www.facebook.com";
//		driver.get(sURL);
		driver.manage().window().maximize();
		// Xpath method
//		String sXpath = "//input[@name='email']";
//		String sXpath ="//input[@id='email']";
//		String sXpath ="//input[contains(@name,'email')]";
//		String sXpath ="//input[ @name ='email' or @id='ema']";
//		String sXpath ="//input[ @name ='email' and @id='email']";
//		String sXpath ="//input[ starts-with(@name,'em')]";
//		String sXpath ="//a[text()='Forgotten password?']";
		//span[text()='Meta @2022']
//		driver.findElement(By.xpath(sXpath)).sendKeys("abc@gmail.com");
//		driver.findElement(By.xpath(sXpath)).click();
		
		//Axes method of Xpath
		
		driver.get("https://www.snapdeal.com");
//		String sXpath = "//a[@class='menulinks leftCategoriesProduct ']//parent::li";
//		String sXPath = "//a[@class='menulinks leftCategoriesProduct ']//child::span";
		String sXPath = "//a[@class='menulinks leftCategoriesProduct']//self::span";
		
		driver.findElement(By.xpath(sXPath)).click();
		
		

	}

}
