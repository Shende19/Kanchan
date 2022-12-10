package launchingbrowseroperation;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	static WebDriver driver;
	static String sDriverPath =System.getProperty("user.dir") + "//Drivers//";
	static String sURL = "https://www.snapdeal.com";

	public static void fBrowserLauncher()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//" );
		driver =new ChromeDriver();		
	}

	public static void main(String[] args) {
		fBrowserLauncher();
		driver.manage().window().maximize();
		driver.get(sURL);
		
		List<WebElement> allOptions = driver.findElements(By.tagName("ul"));
		System.out.println(allOptions.size());
		
		for(int i=0; i<allOptions.size();i++)
		{
			System.out.println("List Options :"+ allOptions.get(1).getText());
		}

	}

}
