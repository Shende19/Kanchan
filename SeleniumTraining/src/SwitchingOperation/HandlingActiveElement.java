package SwitchingOperation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingActiveElement {
	static WebDriver driver;
	static String sDriverPath = System.getProperty("user.dir") + "//Drivers//";
	
	static void fLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//" );
		driver=new ChromeDriver();
		
	}
	public static void main(String[] args) {
		fLaunchBrowser();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		//validate by default curser is pointing to username input field
		WebElement activeobject = driver.switchTo().activeElement();
		String activeelementPlaceholder = activeobject.getAttribute("Placeholder");
		String expectedActiveObject = "username";
		if(activeelementPlaceholder.equals(expectedActiveObject))
		{
			System.out.println("cursor pointer validation is successful");
		}
		else
		{
			System.out.println("cursor pointer validation is unsuccessful");
		}
		//login in actitime application without identifying any object
		activeobject.sendKeys("admin",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
		
		
		
		
		
	}

}
