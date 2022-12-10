package launchingbrowseroperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	static WebDriver driver;
	static String sDriverPath = System.getProperty("user.dir") + "\\Drivers\\";

	public static void fLauncherBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "\\chromedriver.exe\\");
		driver = new ChromeDriver();

	}

	public static void main(String[] args) {

		fLauncherBrowser();
		driver.manage().window().maximize();
		String sURL = "https://www.facebook.com";
		driver.get(sURL); //launching browser

		//locating by tag name
		driver.findElement(By.tagName("button")).click();

		//locating by id
		driver.findElement(By.id("loginbutton")).click();

		//locating by name
		driver.findElement(By.name("login")).click();

		//locating by link text
		driver.findElement(By.linkText("Forgotten password?")).click();

		//locating by partial text
		driver.findElement(By.partialLinkText("password?")).click();

//		driver.findElement(By.partialLinkText("?")).click();

		//locating by class name
		driver.findElement(By.className("_42ft_4jy0_52e0_4jy6_4jy1 selected_51sy")).click();

		driver.close();

	}

}
