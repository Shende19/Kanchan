package SwitchingOperation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingActiveElement2{
	static WebDriver driver;
	static String sDriverPath = System.getProperty("user.dir") + "//Drivers//";
	
	static void fLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//" );
		driver=new ChromeDriver();
		
	}

	public static void main(String[] args) {
		fLaunchBrowser();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//identifying element by active element method
		WebElement activeobject = driver.switchTo().activeElement();
		String activeObjectPlaceholder = activeobject.getAttribute("placeholder");
		String expectedactiveObject ="Email address or phone number";
		if(activeObjectPlaceholder .equals(expectedactiveObject))
		{
			System.out.println("cursor pointer validation is successful");
		}
		else
		{
			System.out.println("cursor pointer validation is not successful");
		}
		activeobject.sendKeys("abc@gmail.com",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);

	}

}
