package seleniumassignmentprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocatorsProgram1 {
	
	static WebDriver driver;
	static String sDriverPath = System.getProperty("user.dir")+"//Drivers//";
	
	public static void fLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe//");
		driver = new ChromeDriver();
		
	}
	
	public static void main(String[] args) 
	{
		fLaunchBrowser();
		String sURL = "https://genrt-qa.genscape.com/login"; //launching URL using chrome browser
		driver.get(sURL);
		driver.manage().window().maximize();
 		WebElement wUsernameField = driver.findElement(By.name("username"));//find Username Element by using Name locator
 		wUsernameField.sendKeys("abc@gmail.com"); //enter email address
 		wUsernameField.click();
  		WebElement wPasswordField = driver.findElement(By.id("login-password"));//find Pwd Element by using ID locator
  		wPasswordField.sendKeys("123456");
  		wPasswordField.click();
  		WebElement wSignInField = driver.findElement(By.linkText("SIGN IN"));//find SignIn Element by using linktext locator
  		wSignInField.click();
//  		WebElement wSignInField1 = driver.findElement(By.partialLinkText("IN"));//find SignIn Element by using linktext locator
//  		wSignInField1.click();
   		
	}
	
}

