package SwitchingOperation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingActiveElement3 {
	static WebDriver driver;
	static String sDriverPath = System.getProperty("user.dir") + "//Drivers//";
	
	static void fLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//" );
		driver=new ChromeDriver();
		
	}

	public static void main(String[] args) {
		fLaunchBrowser();
		driver.get("https://www.flipkart.com");
		//identifying element without locator by using active element
		WebElement activeObject = driver.switchTo().activeElement();
		String activeobjectElement = activeObject.getAttribute("type");
		String expectedactiveObjectElement = ("text");
		if(activeobjectElement.equals(expectedactiveObjectElement))
		{
			System.out.println("cursor pointer validation successful ");
		}
		else
		{
			System.out.println("cursor pointer validation is not  successful");
		}
		activeObject.sendKeys("admin@gmail.com ",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("admin",Keys.ENTER);
		
		
		
		
		
		
	}

}
