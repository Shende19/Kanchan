package seleniumassignmentprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOperation3 {
	static WebDriver driver;
	static String sDriverPath = System.getProperty("user.dir" ) + "//Drivers//" ;
	
	static void FLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//");
		driver = new ChromeDriver();
	}

	public static void main(String[] args) {
		FLaunchBrowser();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		// identify the First Name field
		WebElement FirstName =driver.findElement(By.tagName("input"));
		//type first name as admin and use ctrl+a
		FirstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
		//in firstName field use ctrl+c
		FirstName.sendKeys( Keys.chord(Keys.CONTROL,"c"));
		//identify lastName field and use ctrl+v
		WebElement LastNameField = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
//		LastNameField.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		LastNameField.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}

}
