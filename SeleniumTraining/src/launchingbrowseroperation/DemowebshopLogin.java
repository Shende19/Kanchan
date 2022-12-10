package launchingbrowseroperation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemowebshopLogin {

	static WebDriver driver;
	static String sDriverPath = System.getProperty ("user.dir") + "//Drivers//";

	public static void fLaunchBrowser()

	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//");
		driver = new ChromeDriver();

	}

	public static void main(String[] args) {

		fLaunchBrowser();
		String sURL = "https://demowebshop.tricentis.com";
		driver.get(sURL);
		driver.manage().window().maximize();
		//click on login button
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Password@123"); 
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		
  		driver.navigate().back();
  		driver.navigate().refresh();
 		driver.findElement(By.id("RememberMe")).click();



		 
		
	}

}
