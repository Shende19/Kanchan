package SwitchingOperation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingActiveElement4 {
	static WebDriver driver;
	static String sDriverpath = System.getProperty("user.dir") + "//Drivers//";
	
	static void FLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverpath + "//chromedriver.exe//" );
		driver = new ChromeDriver();
	}

	public static void main(String[] args) {
		FLaunchBrowser();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement activeObject = driver.switchTo().activeElement();
		//identifying element without using locator and comapre it using equals method
		String actualobject = activeObject.getAttribute("name");
		String  expectedobject = "username";
		if (actualobject.equals(expectedobject))
		{
			System.out.println("cursor pointing is successful");
		}
		else
		{
			System.out.println("cursor pointing is not successful");
		}
		activeObject.sendKeys("admin",Keys.CONTROL.TAB);
		driver.switchTo().activeElement().sendKeys("manager",Keys.CONTROL.ENTER);
		
		
	}

}
