package seleniumassignmentprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOperation2 {
	static WebDriver driver;
	static String sDriverPath = System.getProperty("user.dir" ) + "//Drivers//" ;
	
	static void FLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//");
		driver = new ChromeDriver();
	}
	public static void main(String[] args) {
		FLaunchBrowser();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//login actitime using enter key
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB);
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		

	}

}
