package seleniumassignmentprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
	static WebDriver driver;
	static String sDriverPath =System.getProperty("user.dir") + "//Drivers";
	
	static void fLaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", sDriverPath + "//chromedriver.exe" );
		driver = new ChromeDriver();
		
	}

	public static void main(String[] args) {
		fLaunchBrowser(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
		driver.get("https://demo.actitime.com/login.do");
		String expectedTitle="actiTime - Login";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Login Page Opened Successfullyp");
		}
		else 
		{
			System.out.println("either login page not opened or page title got changed");
		}
		
		WebElement wUsernameField = driver.findElement(By.id("username"));
 		wUsernameField.sendKeys("trainee");
		 //validation operation on webpage
//		System.out.println("username input field visibilility status is :"+wUsernameField.isDisplayed());
//		System.out.println("username input field editable status is :"+wUsernameField.isEnabled());
//		String actualDefaultTextOnUsernameField=wUsernameField.getAttribute("placeholder");
//		System.out.println("Default text validation for username field: "+actualDefaultTextOnUsernameField.equals("username"));
		
		WebElement wPasswordField = driver.findElement(By.name("pwd"));
		wPasswordField.sendKeys("trainee");
		//validation operation on webpage
//		System.out.println("username input field visibilility status is :"+wPasswordField.isDisplayed());
//		System.out.println("username input field editable status is :"+wPasswordField.isEnabled());
//		 
		//click on checkbox
		WebElement wCheckBox = driver.findElement(By.id("keepLoggedInLabel"));
		 
//		System.out.println("checkbox visibility status is :" +wCheckBox.isDisplayed());
//		System.out.println("checkbox editable status is :" +wCheckBox.isEnabled());
//		System.out.println("checkbox default status is :"+ wCheckBox.isSelected());
		wCheckBox.click();
 		 	
		//click on log in button
 	 	WebElement wLoginButton = driver.findElement(By.id("loginButton"));
 	 	wLoginButton.click();
// 	 	System.out.println("LoginButton visibility status is :" +wLoginButton.isDisplayed());
//		System.out.println("LoginButton editable status is :" +wLoginButton.isEnabled());
// 		
		
		 
	}

}
