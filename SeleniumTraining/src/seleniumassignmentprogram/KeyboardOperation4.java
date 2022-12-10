package seleniumassignmentprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOperation4 {
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
		//identify the homepage and use Escape of Keyboard to avoid popup
		WebElement element =driver.findElement(By.xpath("//body"));
		element.sendKeys(Keys.ESCAPE);
		 for(int i=0;i<10;i++)
		{
			element.sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(1500);		
		} 
		//directly go to bottom page
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		Thread.sleep(1400);
		//directly go to top of the page
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));
		Thread.sleep(1400); 
		 
		
		
	}
		 
	
}
