package mouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation1 {
	static WebDriver  driver;
	static String sDriverPath = System.getProperty("user.dir") + "//Drivers//" ;
	
	static void fLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//" );
		driver= new ChromeDriver();
	}

	public static void main(String[] args) {
		fLaunchBrowser();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		//identify FirstName field
		WebElement FirstNameField = driver.findElement(By.cssSelector( "input[placeholder='First Name']"));
		FirstNameField.sendKeys("admin");
		//create an instance of action class and pass browser instance to its constructor
		Actions act = new Actions(driver);
		//perform appropriate action with help of action class ref
		act.moveToElement(FirstNameField).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		//paste it into last name field
		WebElement LastNameField = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		//perform appropriate action by using action class ref
		act.moveToElement(LastNameField).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	
	}

}
