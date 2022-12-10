package seleniumassignmentprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocatorsProgram2 {
	static WebDriver driver;
	static String sDriverPath = System.getProperty("user.dir")+ "//Drivers//";
	
	static void FLaunchChromeBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath +"//chromedriver.exe" );
		driver = new ChromeDriver();
		
	}

	public static void main(String[] args) {
		FLaunchChromeBrowser();
		String sURL ="https://www.facebook.com";// Launching URL By Using Chrome Browser
		driver.get(sURL);
  		/*WebElement wUsernameField =driver.findElement(By.name("email"));//Finding Username Element by using Name Locator
  		wUsernameField.sendKeys("abc@gmail.com");//enter email address
 		wUsernameField.click();
 		WebElement wPasswordField =driver.findElement(By.id("pass"));//Finding Password Element by using ID Locator
 		wPasswordField.sendKeys("admin");//enter password field
 		wPasswordField.click();
  		WebElement wForgotPassword = driver.findElement(By.linkText("Forgotten password?"));//Finding ForgotPassword Element by using LinkText  Locator
  		wForgotPassword.click();
 		WebElement wForgotPassword1 = driver.findElement(By.partialLinkText("Forgotten"));//Finding ForgotPassword Element by using PartialLinkText Locator
 		wForgotPassword1.click();
 		*/
//		WebElement wLogInField = driver.findElement(By.tagName("button"));//Finding LogINfield Element by using TagName Locator
//		wLogInField.click();
		WebElement wUsernameField = driver.findElement(By.id("email"));//finding UsernameField Element by using ID Locator
		wUsernameField.sendKeys("abcde");//enter text in Username Field
		wUsernameField.click();//click on the Text
		wUsernameField.clear();//clear the entered Text
		WebElement wLogInField = driver.findElement(By.tagName("button"));
		wLogInField.click();
		
		
	}

}
